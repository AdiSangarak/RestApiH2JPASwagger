package in.adi.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import in.adi.sb.entity.AssetAndEmployee;

public interface AssetAndEmployeeRepository extends JpaRepository<AssetAndEmployee,Integer> {

	
}
