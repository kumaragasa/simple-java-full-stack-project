package com.example.list_students_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ListStudentsMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListStudentsMavenApplication.class, args);
	}

}
