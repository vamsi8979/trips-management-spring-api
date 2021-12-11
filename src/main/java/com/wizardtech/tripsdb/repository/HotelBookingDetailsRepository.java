package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.HotelBookingDetails;

public interface HotelBookingDetailsRepository extends MongoRepository<HotelBookingDetails, String>{
	
	@Query("{}")
	List<HotelBookingDetails> findAll();

	
	@Query("{id:'?0'}")
	HotelBookingDetails findOne(String id);
}
