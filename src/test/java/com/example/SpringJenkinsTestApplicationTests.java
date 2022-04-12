package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsTestApplicationTests {
	
private static final Logger log = LoggerFactory.getLogger(SpringJenkinsTestApplicationTests.class);
	
	@Test
	void contextLoads() {
		log.info("Test case executed...");
		assertEquals(true, true);
	}

}
