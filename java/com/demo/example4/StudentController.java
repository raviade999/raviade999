package com.demo.example4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.demo.springfirst.employees;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RequestMapping("student/")
@CrossOrigin("http://localhost:4200/")
@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("student")
	public Student addStudent(@RequestBody Student student1) {
		Student student=studentRepo.save(student1);
		
		return student;
	}
	
	@GetMapping("update")
	public List<Student> findAll()
	{
		List<Student>list1=studentRepo.findAll();
		return list1;
	
	}
	
	@GetMapping("stu/{id}")  //Database id show then used that method /API
	public Student  findByempid(@PathVariable("id")int id)
	{
		Student student=studentRepo.findById(id).get();
		return student;
		
	}
	
	//Update the database then that used the @put the method.
	
	@PutMapping("stu1/{id}")
	public Student updateStudent(@PathVariable("id") int id, @RequestBody Student updatedStudent) 
	{
	    Student existingStudent = studentRepo.findById(id).orElse(null);
	    if (existingStudent != null) 
	    {
	        existingStudent.setName(updatedStudent.getName());
	        existingStudent.setLocation(updatedStudent.getLocation());
	        existingStudent.setEmail(updatedStudent.getEmail());
	        existingStudent.setAge(updatedStudent.getage());
	        existingStudent.setContact(updatedStudent.getContact());
	        
	        return studentRepo.save(existingStudent);
	    } 
	    else 
	    {
	        return null; // or throw an exception indicating student not found
	    }
	}
	
	@DeleteMapping("student/{id}"+ "")
	public boolean deleteByid(@PathVariable("id")int id ) 
	{
		boolean status=false;
		if(id!=0)
		{
			studentRepo.deleteById(id);
			status=true;
		}
		return status;
	}
	
	
	@PutMapping("student2/{id}")
	public Student updteStudent(@RequestBody Student student) 
	{
		Student student1= studentRepo.save(student);
		
		return student1;
	}

}
