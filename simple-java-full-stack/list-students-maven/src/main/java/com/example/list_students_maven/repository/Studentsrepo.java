package com.example.list_students_maven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.list_students_maven.model.Students;


public interface Studentsrepo extends JpaRepository<Students, Long>{

}
