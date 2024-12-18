package com.phyo.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	 contextLoads() {
		logger.info("Test Case Executing...");
		logger.info("Test Case Executing Second Log Statement...");
		assertEquals(true,true);
	}

}
