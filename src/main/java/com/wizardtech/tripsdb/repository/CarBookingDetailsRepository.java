package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.CarBookingDetails;

public interface CarBookingDetailsRepository extends MongoRepository<CarBookingDetails, String>{
	
	@Query("{}")
	List<CarBookingDetails> findAll();
	
	
	@Query("{id:'?0'}")
	CarBookingDetails findOne(String id);
}
