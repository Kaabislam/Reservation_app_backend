package com.kaab.Reservation.app.backend;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReservationAppBackendApplicationTests {
	public static Logger logger = (Logger) LoggerFactory.getLogger(ReservationAppBackendApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Case executing...");
		assertEquals(true,true);
	}

}
