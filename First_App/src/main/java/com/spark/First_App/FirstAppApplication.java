package com.spark.First_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello there");
		SpringApplication.run(FirstAppApplication.class, args);
		System.out.println("Bye there");
	}

}
