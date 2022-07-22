package in.adi.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import in.adi.sb.entity.Asset;

@Repository
@Transactional
public interface AssetRepository extends JpaRepository<Asset,Integer> {

	@Query("FROM Asset u WHERE u.asset_name=:asset_name")
	Asset getAssetByAsset_name( @Param("asset_name") String asset_name);
	
	@Query("FROM Asset u WHERE u.asset_id=:asset_id")
	Asset findByAsset_id( @Param("asset_id") int asset_id);
	
	

}

