package com.wizardtech.tripsdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.TripsList;
import com.wizardtech.tripsdb.service.TripsListService;

@RestController
public class TripsListController {
	
	@Autowired
	private TripsListService tripsListService;
	
	@RequestMapping("/trips")
	public ResponseEntity<List<TripsList>> getTripsList() {
		try {
			return new ResponseEntity<>(tripsListService.getDBTripsList(), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//@RequestMapping(method = RequestMethod.POST,value = "/trips")
	//public void addTripList(@RequestBody TripsList tripList) {
		//tripsListService.addTripList(tripList);
	//}
	
	//don't need this we can remove later
	//@RequestMapping("/trips/{id}")
	//public TripsList getOneTripFromList(@PathVariable("id") String id) {
		//return tripsListService.getOneTripFromList(id);
    //}
	
	
}