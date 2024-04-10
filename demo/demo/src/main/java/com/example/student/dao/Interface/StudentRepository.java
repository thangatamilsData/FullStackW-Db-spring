package com.example.student.dao.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.student.model.Student;


@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
	
	@Query(value = "SELECT * FROM tamil WHERE name = :name", nativeQuery = true)
	Student show(@Param("name") String name);
	
	
}


