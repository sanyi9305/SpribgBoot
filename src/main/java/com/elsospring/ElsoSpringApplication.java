package com.elsospring;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class ElsoSpringApplication {
	
	@Bean
	public Person giveMeAPerson() {

		return new Person("Joska",11);
	}

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(ElsoSpringApplication.class, args);

		String[] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);

		for (String name : beanArray) {
			System.out.println(name);
		}

	}
}
