package com.bo.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HellowordApplication {
	@RequestMapping("/")
	String home(){
		return "진호 못생김";
	}

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}

}
