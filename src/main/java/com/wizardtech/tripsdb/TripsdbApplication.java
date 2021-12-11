package com.wizardtech.tripsdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TripsdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripsdbApplication.class, args);
	}
}