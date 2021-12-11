package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.UserCard;

public interface UserCardRepository extends MongoRepository<UserCard, String>{
	
	@Query("{}")
	List<UserCard> findAll();
	
	@Query("{email:'?0'}")
	UserCard findByEmail(String email);
	
	
	@Query(value="{email:'?0'}",delete = true)
	void deleteByemail(String email);
}
