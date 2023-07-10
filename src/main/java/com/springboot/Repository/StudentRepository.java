package com.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
