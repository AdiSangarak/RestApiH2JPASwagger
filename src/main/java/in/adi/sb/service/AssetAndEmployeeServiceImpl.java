package in.adi.sb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.adi.sb.dao.AssetAndEmployeeRepository;
import in.adi.sb.dao.AssetRepository;
import in.adi.sb.dao.EmployeeRepository;
import in.adi.sb.entity.Asset;
import in.adi.sb.entity.AssetAndEmployee;
import in.adi.sb.entity.Asset_assigned_status;
import in.adi.sb.entity.Employee;

@Service
public class AssetAndEmployeeServiceImpl implements AssetAndEmployeeService {

	@Autowired
	private AssetAndEmployeeRepository aaer;
	
	@Autowired
	private AssetRepository ar;
	
	@Autowired
	private EmployeeRepository er;
	
	
	@Override
	public AssetAndEmployee saveAssetAndEmployee(AssetAndEmployee assetAndEmployee) {
		
		Optional<Employee> employee = er.findById(assetAndEmployee.getEmployee_id());
		Optional<Asset> asset = ar.findById(assetAndEmployee.getAsset_id());
		if(employee.isPresent() && asset.isPresent() && !ar.findByAsset_id(assetAndEmployee.getAsset_id()).getAsset_assigned_status().equals("ASSIGNED") )
			return aaer.save(assetAndEmployee);
		else
			throw new RuntimeException("Error in Employee id or Asset id");
	}
	
	@Override
	public void recoverAssetFromEmployee(int asset_id)
	{
		ar.findByAsset_id(asset_id).setAsset_assigned_status(Asset_assigned_status.RECOVERED);
	}
	
}
