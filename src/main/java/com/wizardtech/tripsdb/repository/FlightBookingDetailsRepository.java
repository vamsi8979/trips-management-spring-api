package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.FlightBookingDetails;

public interface FlightBookingDetailsRepository extends MongoRepository<FlightBookingDetails, String>{
	
	@Query("{}")
	List<FlightBookingDetails> findAll();
	
	
	@Query("{id:'?0'}")
	FlightBookingDetails findOne(String id);
}
