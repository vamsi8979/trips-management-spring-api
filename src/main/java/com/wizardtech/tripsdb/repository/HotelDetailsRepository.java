package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.HotelDetails;

public interface HotelDetailsRepository extends MongoRepository<HotelDetails, String>{
	
	@Query("{}")
	List<HotelDetails> findAll();
	
}