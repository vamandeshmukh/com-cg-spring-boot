package com.cg.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Vaman Deshmukh
 * 
 *         {@link https://github.com/vamandeshmukh/com-cg-spring-boot}
 *
 */

@SpringBootApplication
public class ComCgSpringBootApplication {

	public static void main(String[] args) {

		System.out.println("Start");

		SpringApplication.run(ComCgSpringBootApplication.class, args);

		System.out.println("End");
	}

}
