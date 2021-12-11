package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.UserProfile;

public interface UserProfileRepository extends MongoRepository<UserProfile, String>{
	
	@Query("{}")
	List<UserProfile> findAll();
	
	@Query("{email:'?0'}")
	UserProfile findOneByEmail(String email);

	
	@Query("{nickname:'?0'}")
	UserProfile getProfileByNickName(String nickname);

	@Query(value="{email:'?0'}",delete = true)
	void deleteByemail(String email);
}
