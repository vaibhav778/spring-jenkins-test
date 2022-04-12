package com.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsTestApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsTestApplication.class);

	@PostConstruct
	public void init()
	{
		log.info("Application started...");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsTestApplication.class, args);
	}

}
