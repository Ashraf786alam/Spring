package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployApplication {
	
	@GetMapping("/home")
	public String Home() {
		return "This is home Page of springboot application and try to deploy on External Tomcat Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}

}
