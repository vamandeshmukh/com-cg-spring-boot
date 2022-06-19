package com.cg.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

//	http://localhost:9999/hello
	@GetMapping("/hello")
	public String hello() {
		LOG.info("Hello");
		return "Hello world!";
	}

}
