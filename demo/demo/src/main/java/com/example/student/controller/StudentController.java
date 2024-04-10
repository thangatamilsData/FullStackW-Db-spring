package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/tamil")
@CrossOrigin(origins = "*")
public class StudentController {
	
	
    public final StudentService studentService; //reference
    
    
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    
    @GetMapping("/{name}")
    public Student getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }
}
