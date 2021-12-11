package com.wizardtech.tripsdb.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.TripDetails;


public interface TripsDetailsRepository extends MongoRepository<TripDetails, String> {
    
  
	@Query("{id:'?0'}")
	TripDetails findOne(String id);
	
	
	@Query("{}")
	List<TripDetails> findAll();
}
