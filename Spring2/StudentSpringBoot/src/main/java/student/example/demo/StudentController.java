package student.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/GetStudent")
	public List<Student>getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@PostMapping("/AddStudent")
	public void addStudent(@RequestBody Student stu)
	{
		service.addStudent(stu);
	}
	
	@PostMapping("/deleteStudent/{rollno}")
	public void deleteStudent(@PathVariable String rollno)
	{
		service.deleteStudent(rollno);
	}
	
	@GetMapping("/GetStudent1/{rollno}")
	public Optional<Student> getAllStudent(@PathVariable String rollno)
	{
		return service.findById(rollno);
	}
	
	@PostMapping("/updateStudent/{rollno}")
	public void updateStudents(@PathVariable String rollno, @RequestBody Student stu)
	{
	service.updateStudent(stu,rollno);
	}
	

}
