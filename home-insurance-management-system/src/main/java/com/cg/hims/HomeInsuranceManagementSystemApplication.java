package com.cg.hims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class HomeInsuranceManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeInsuranceManagementSystemApplication.class, args);
		System.out.println("connected to database");
	}

}
