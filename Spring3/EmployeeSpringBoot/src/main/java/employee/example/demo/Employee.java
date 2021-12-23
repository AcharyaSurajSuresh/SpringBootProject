package employee.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	String email;
	@Id
	String id;
	String name;
	String salary;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	public Employee(String email, String id, String name, String salary) {
		super();
		this.email = email;
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

}
