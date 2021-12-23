package employee.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	
	@GetMapping("/Getemployees")
	public List<Employee> getAllEmployees()
	{
		return repository.findAll();
	}
	
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee ee)
	{
		repository.save(ee);
	}
	
	@PostMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		repository.deleteById(id);
	}

}
