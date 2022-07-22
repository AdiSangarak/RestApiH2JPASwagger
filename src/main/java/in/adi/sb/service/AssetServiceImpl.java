package in.adi.sb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.adi.sb.dao.AssetRepository;
import in.adi.sb.entity.Asset;


@Service
public class AssetServiceImpl implements AssetService{
	@Autowired
	private AssetRepository ar;

	@Override
	public List<Asset> getAssets() {
		return ar.findAll();
	}
	

	@Override
	public Asset findByAsset_id(int asset_id)
	{
		return ar.findByAsset_id(asset_id);
	}

	@Override
	public Asset saveAsset(Asset asset) {
		
		return ar.save(asset);
	}
		
	@Override 
	public Asset getAssetByAsset_name(String asset_name)
	{
		
		return ar.getAssetByAsset_name(asset_name);
		
	}
	
	@Override
	public void deleteAsset(int asset_id)
	{
		ar.deleteById(asset_id);
	}

	@Override
	public Asset updateAsset(Asset asset) {
		return ar.save(asset);
	}
}
