package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mockeds.ServiceMockedData;
import com.example.demo.models.TestModel;

@SpringBootApplication
public class BuminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuminApplication.class, args);
	}
	
}
