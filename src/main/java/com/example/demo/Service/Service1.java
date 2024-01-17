package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Students;

public interface Service1 {

	public Students addStudent(Students students);
	
	public List<Students> getAllStudents();
	
	public String deleteStudent(int id);
	
	public Students updateStudent(Students students);
	
	public Students getStudent(int id);
}
