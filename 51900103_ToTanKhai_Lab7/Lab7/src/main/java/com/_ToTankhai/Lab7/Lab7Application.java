package com._ToTankhai.Lab7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab7Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}

	@Override 
	public void run(String ...args) throws Exception {
		System.out.println("Hello world!!!");
	}
}
