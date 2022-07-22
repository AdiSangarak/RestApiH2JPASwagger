package in.adi.sb.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.adi.sb.entity.Asset;
import in.adi.sb.service.AssetService;

@RestController
public class AssetController {

	@Autowired
	private AssetService as ;
	
	@GetMapping("/assets")
	public List<Asset> getAssets()
	{
		return as.getAssets();
	}
	
	//Take as query /asset/?a_n=hp_pencil
	@GetMapping("/asset/{a_n}")
	public Asset getAsset(@PathVariable("a_n") String a_name)
	{
		
		return as.getAssetByAsset_name(a_name);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@DeleteMapping("/asset/{a_id}")
	public void deleteAsset(@PathVariable("a_id") int a_id)
	{
		if(!as.findByAsset_id(a_id).getAsset_assigned_status().equals("AVAILABLE"));
			as.deleteAsset(a_id);
	}
	
	@PostMapping("/asset")
	public Asset saveAsset(@Valid @RequestBody Asset asset)
	{
		
		return as.saveAsset(asset);
	}
	
	@PutMapping("/asset/{a_id}")
	public Asset updateAsset(@PathVariable int a_id ,@RequestBody Asset asset)
	{
		asset.setAsset_id(a_id);
		return as.updateAsset(asset);
	}
}
