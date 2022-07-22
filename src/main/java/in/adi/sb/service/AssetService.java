package in.adi.sb.service;
import java.util.List;
import in.adi.sb.entity.Asset;

public interface AssetService {
	List<Asset> getAssets();
	Asset saveAsset(Asset Asset);
	void deleteAsset(int Asset_id);
	Asset updateAsset(Asset Asset);
	Asset getAssetByAsset_name(String asset_name);
	Asset findByAsset_id(int asset_id);
	}