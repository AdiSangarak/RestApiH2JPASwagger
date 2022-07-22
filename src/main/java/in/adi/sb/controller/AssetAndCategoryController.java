package in.adi.sb.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.adi.sb.entity.AssetAndCategory;
import in.adi.sb.service.AssetAndCategoryService;

@RestController
public class AssetAndCategoryController {

	@Autowired
	private AssetAndCategoryService aacs;
	
	@PostMapping("/assetAndCategory")
	public AssetAndCategory saveAssetAndCategory(@Valid @RequestBody AssetAndCategory assetAndCategory)
	{
		return aacs.saveAssetAndCategory(assetAndCategory);
	}
}
