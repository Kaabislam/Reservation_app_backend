package com.kaab.Reservation.app.backend;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ReservationAppBackendApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(ReservationAppBackendApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Case executing...");
		assertEquals(true,true);
	}

}
