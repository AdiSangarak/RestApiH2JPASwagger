package in.adi.sb.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.adi.sb.entity.Employee;
import in.adi.sb.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@Valid @RequestBody Employee employee)
	{
		return es.saveEmployee(employee);
	}
}
