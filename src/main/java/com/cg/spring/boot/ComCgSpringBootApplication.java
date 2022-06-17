package com.cg.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger LOG = LoggerFactory.getLogger(ComCgSpringBootApplication.class);

	public static void main(String[] args) {

		LOG.info("Starting...");
		SpringApplication.run(ComCgSpringBootApplication.class, args);
		LOG.info("Started...");

	}

}
