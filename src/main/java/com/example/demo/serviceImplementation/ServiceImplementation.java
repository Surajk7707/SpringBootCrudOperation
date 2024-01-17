package com.example.demo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.Service.Service1;

@Service
public class ServiceImplementation implements Service1 {
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Students addStudent(Students students) {
		try {
			Students add=studentRepo.save(students);
			return add;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Students> getAllStudents() {
		try {
			List<Students> findall =studentRepo.findAll();
			return findall;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public String deleteStudent(int id) {
		try {
			studentRepo.deleteById(id);
			return "deleted successfully student"+id;
		} catch (Exception e) {
		e.printStackTrace();
		return null;
		}
		
	}

	@Override
	public Students updateStudent(Students students) {
	try {
		Students update= studentRepo.findById(students.getId()).get();
		update.setMarks(students.getMarks());
		update.setDiv(students.getDiv());
		update.setName(students.getName());
		update.setCollageName(students.getCollageName());
		return studentRepo.save(update);
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
		
	}

	@Override
	public Students getStudent(int id) {
		try {
			Students get=studentRepo.findById(id).get();
			return get;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

}
