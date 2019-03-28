package com.infosys.springboot_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SpringBootApp.class);
		app.run();
		//SpringApplication.run(SpringBootApp.class, args);  
	}

}
