package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	private String password = "DebuAndres";
	public String greet() {
		return "Finaliza el curso DevOps Foundation v4 - Andres Ibarra";
	}
}
