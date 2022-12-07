package com.demo.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.demo.demo.model.Student;

@Service
public interface StudentService {
	
	   public Student saveStudent(Student student) ;
	   public Student getstudentName(int rollNo);
	   public ArrayList<Student> getAllStudents();
	
}
