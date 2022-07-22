package in.adi.sb.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.adi.sb.entity.AssetAndEmployee;
import in.adi.sb.service.AssetAndEmployeeService;

@RestController
public class AssetAndEmployeeController {

	@Autowired
	private AssetAndEmployeeService aaes;
	
	@PostMapping("/assetAndEmployee")
	public AssetAndEmployee saveAssetAndEmployee(@Valid @RequestBody AssetAndEmployee assetAndEmployee)
	{
		return aaes.saveAssetAndEmployee(assetAndEmployee);
	}
	
	//recoverAssetFromEmployee
	
	@DeleteMapping("/assetAndEmployee/{a_id}")
	public void recoverAssetFromEmployee(@PathVariable("a_id") int a_id)
	{
		aaes.recoverAssetFromEmployee(a_id);
	}
}
