package com.example.student.service;

import com.example.student.dao.Interface.StudentRepository;
import com.example.student.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


	@Autowired
    private StudentRepository studentRepository;

    
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

	public Student getStudentByName(String name) {
		return studentRepository.show(name);
		
	}
}
