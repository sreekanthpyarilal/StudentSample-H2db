package com.demo.demo.service;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.Student;
import com.demo.demo.repo.StudentRepository;

@Service
public class ServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return  studentRepository.save(student)  ;
	}


		

	@Override
	public ArrayList<Student> getAllStudents() {
		
		return (ArrayList<Student>) studentRepository.findAll();
	}




	@Override
	public Student getstudentName(int rollNo) {
		
		return studentRepository.getByRollNo(rollNo);
	}



}
