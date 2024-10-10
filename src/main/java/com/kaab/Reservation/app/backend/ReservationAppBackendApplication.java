package com.kaab.Reservation.app.backend;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class ReservationAppBackendApplication {
	public static Logger logger = (Logger) LoggerFactory.getLogger(ReservationAppBackendApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Application started...");
	}
	public static void main(String[] args) {
		logger.info("Application Executed...");

		SpringApplication.run(ReservationAppBackendApplication.class, args);
	}

}
