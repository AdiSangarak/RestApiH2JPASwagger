package in.adi.sb.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity()
@Table(name="employee")
public class Employee{

	@Column(name="employee_id")
	public @Id @GeneratedValue(strategy=GenerationType.IDENTITY) int employee_id ;
	
	@Column(name="employee_name",nullable=false)
	@NotNull()
	public String employee_name ;
	
	@Column(name="employee_designation",nullable=false)
	@NotNull()
	public String employee_designation;
	
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_designation() {
		return employee_designation;
	}

	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}

	public Employee(int employee_id, @NotNull String employee_name, @NotNull String employee_designation) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_designation = employee_designation;
	}

	public Employee() {
		super();
	}
	
	

}