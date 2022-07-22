package in.adi.sb.service;

import in.adi.sb.entity.AssetAndEmployee;

public interface AssetAndEmployeeService {
	 AssetAndEmployee saveAssetAndEmployee(AssetAndEmployee assetAndEmployee);
	 void recoverAssetFromEmployee(int asset_id);
}
