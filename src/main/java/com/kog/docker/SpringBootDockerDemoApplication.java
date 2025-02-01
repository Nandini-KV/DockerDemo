package com.kog.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "hello all";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerDemoApplication.class, args);
	}

}
