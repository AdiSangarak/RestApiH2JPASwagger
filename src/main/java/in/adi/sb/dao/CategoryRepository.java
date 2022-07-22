package in.adi.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import in.adi.sb.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
