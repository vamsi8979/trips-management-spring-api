package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.CarDetails;

public interface CarDetailsRepository extends MongoRepository<CarDetails, String>{
	
	@Query("{}")
	List<CarDetails> findAll();

}