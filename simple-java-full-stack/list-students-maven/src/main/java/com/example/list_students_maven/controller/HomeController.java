package com.example.list_students_maven.controller;import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.list_students_maven.model.Students;
import com.example.list_students_maven.repository.Studentsrepo;



@RestController
@RequestMapping("/students")
public class HomeController {

	@Autowired
	Studentsrepo studentsrepo;
	
	@PostMapping
	@CrossOrigin(origins = "http://127.0.0.1:5501")
    public Students savestudentdata(@RequestBody Students student) {
		
		studentsrepo.save(student);
		
//    	return "data saved";
		return student;
    }
	
     @GetMapping
     @CrossOrigin(origins = "http://127.0.0.1:5501")
	 public List<Students> getstudentdata() {		
			
	      return studentsrepo.findAll() ;
	    }
     
}