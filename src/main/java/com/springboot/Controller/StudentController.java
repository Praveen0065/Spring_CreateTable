package com.springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Entity.Student;
import com.springboot.Repository.StudentRepository;


@RequestMapping("/api")
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//get all the student data using Rest
	
	@GetMapping("/fetch")
	public List<Student> geStudents(){ 
	 return studentRepository.findAll();	
	}
	
	//create employee using Rest
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return studentRepository.save(student);
		
	}
	

	// get by id using Rest
	
	@GetMapping("/get/{id}")
	public Optional<Student> get(@PathVariable long id) {
		return studentRepository.findById(id);
	}
	

}
