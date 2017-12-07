package com.java.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}
	
	@RequestMapping("/process")
	public String runProcess() {
		return "Running process for " + UUID.randomUUID().toString();
	}
}