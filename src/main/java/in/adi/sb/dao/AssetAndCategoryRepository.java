package in.adi.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import in.adi.sb.entity.AssetAndCategory;

public interface AssetAndCategoryRepository extends JpaRepository<AssetAndCategory,Integer> {

}
