package com.wizardtech.tripsdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.TripDetails;
import com.wizardtech.tripsdb.service.TripsDetailsService;

@RestController
public class TripDetailsController {
	@Autowired
	private TripsDetailsService tripsDetailsService;
	
	@RequestMapping("/trips/details/{id}")
	public ResponseEntity<TripDetails> getTripDetails(@PathVariable("id") String id) {
		try{
			return new ResponseEntity<>(tripsDetailsService.getTripDetails(id), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//don't need this we can remove this later 
	//@RequestMapping("/trips/details")
	//public List<TripDetails> findAllTripDetails() {
		//return tripsDetailsService.findAllTripsDetails();
	//}
	
	//don't need this we can remove this later 
	//@RequestMapping(method=RequestMethod.PUT,value = "/trips/details/cancel")
	//public String cancelTripDetailsbyId(@RequestBody CancelRequest cancelRequest) {
		//tripsDetailsService.cancelTripDetailsbyId(cancelRequest.tripId,cancelRequest.confirmationId);
		//return "Cancelled";
	//}
}
