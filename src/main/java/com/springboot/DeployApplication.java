package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployApplication {
	
	@GetMapping("/home1")
	public String Home1() {
		return "This is First home Page of springboot application and try to deploy on External Tomcat Server";
	}

	@GetMapping("/home2")
	public String Home2() {
		return "This is Second home Page of springboot application and try to deploy on External Tomcat Server";
	}

	
	@GetMapping("/home3")
	public String Home3() {
		return "This Third is home Page of springboot application and try to deploy on External Tomcat Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}

}
