package in.adi.sb.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.adi.sb.dao.AssetAndCategoryRepository;
import in.adi.sb.dao.AssetRepository;
import in.adi.sb.dao.CategoryRepository;
import in.adi.sb.entity.Asset;
import in.adi.sb.entity.AssetAndCategory;
import in.adi.sb.entity.Category;

@Service
public class AssetAndCategoryServiceImpl implements AssetAndCategoryService {

	@Autowired
	private AssetAndCategoryRepository aacr;
	
	@Autowired
	private AssetRepository ar;
	
	@Autowired
	private CategoryRepository cr;
	
	
	@Override
	public AssetAndCategory saveAssetAndCategory(AssetAndCategory assetAndCategory) {
		
		Optional<Category> category = cr.findById(assetAndCategory.getAsset_id());
		Optional<Asset> asset = ar.findById(assetAndCategory.getCategory_id());
		if(category.isPresent() && asset.isPresent())
			return aacr.save(assetAndCategory);
		else
			throw new RuntimeException("Error in Category id or Asset id");
	}
	
	
	
}
