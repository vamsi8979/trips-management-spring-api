package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.FlightDetails;

public interface FlightDetailsRepository extends MongoRepository<FlightDetails, String>{
	
	@Query("{}")
	List<FlightDetails> findAll();

}