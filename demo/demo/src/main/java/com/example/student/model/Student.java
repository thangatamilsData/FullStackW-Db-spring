package com.example.student.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tamil")
public class Student {
    @Id
    @SequenceGenerator(
            name = "Student_sequence",
            sequenceName = "Student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Student_sequence"
    )
    private Long id;
    private String name;
    private int age;
   
    private String email;

    public Student(){

    }

    public Student(Long id, String name, int age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        
        this.email = email;
    }

    Student(String name, int age, String email){
        this.name = name;
        this.age = age;
       
        this.email = email;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
   

    public void setEmail(String email){
        this.email= email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
