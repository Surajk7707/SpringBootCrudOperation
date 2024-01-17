package com.example.demo.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Students;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.serviceImplementation.ServiceImplementation;

@RestController
public class Controller {
	
	@Autowired
	ServiceImplementation implementation;
	
	@PostMapping("addStudent")
	public Students addStudent(@RequestBody Students students) {
		return implementation.addStudent(students);
	}
	
	@GetMapping("findAll")
	public List<Students> findAll(){
		return implementation.getAllStudents();
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return implementation.deleteStudent(id);
	}
	
	@PutMapping("updateStudent")
	public Students updateStudent(@RequestBody Students students) {	
	return implementation.updateStudent(students);
	}
	
	@GetMapping("getStudent/{id}")
	public Students getStudent(@PathVariable int id) {
		return implementation.getStudent(id);
	}

}
