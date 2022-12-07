package com.demo.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.Student;
import com.demo.demo.service.StudentService;

@RestController
@RequestMapping(value="student")
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/{save}")
	public Student saveStudent(@RequestBody Student student) {
		return studentservice.saveStudent(student);
		
	}
	
	@GetMapping("/{rollNo}")
	public Student getStudentbyRollno(@PathVariable int rollNo) {
		return studentservice.getstudentName(rollNo);
		
	}
	
	@GetMapping("/all")
	public ArrayList<Student> getAllStudent(){
		return studentservice.getAllStudents();
	}
}
	
	


