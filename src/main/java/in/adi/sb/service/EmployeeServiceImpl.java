package in.adi.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.adi.sb.dao.EmployeeRepository;
import in.adi.sb.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository er;
	

	public Employee saveEmployee (Employee employee) {
		return er.save(employee);
	}

}
