package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.UserAddress;

public interface UserAddressRepository extends MongoRepository<UserAddress, String>{
	
	@Query("{}")
	List<UserAddress> findAll();

	
	@Query("{email:'?0'}")
	UserAddress getAddressByEmail(String email);

	@Query(value="{email:'?0'}",delete = true)
	void deleteByemail(String email);
}
