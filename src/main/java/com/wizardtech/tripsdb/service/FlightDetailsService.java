package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.FlightDetails;
import com.wizardtech.tripsdb.repository.FlightDetailsRepository;

@Service
public class FlightDetailsService {
	@Autowired
	FlightDetailsRepository flightDetailsRepository;
	
	public List<FlightDetails> findAll(){
		return flightDetailsRepository.findAll();
	}
}
