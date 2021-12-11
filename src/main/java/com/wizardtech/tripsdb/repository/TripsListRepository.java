package com.wizardtech.tripsdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wizardtech.tripsdb.model.TripsList;


public interface TripsListRepository extends MongoRepository<TripsList, String> {
    
//    @Query("{name:'?0'}")
//    TripsList findItemByName(String name);
//    
//    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
//    List<TripsList> findAll(String category);
    
	@Query("{}")
	List<TripsList> findAll();


    @Query("{id:'?0'}")
	TripsList findOne(String id);

}
