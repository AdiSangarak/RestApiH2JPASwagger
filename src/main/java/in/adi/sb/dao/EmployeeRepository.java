package in.adi.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import in.adi.sb.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
