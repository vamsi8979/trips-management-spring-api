package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.HotelDetails;
import com.wizardtech.tripsdb.repository.HotelDetailsRepository;

@Service
public class HotelDetailsService {
	@Autowired
	HotelDetailsRepository hotelDetailsRepository;
	
	public List<HotelDetails> findAll(){
		return hotelDetailsRepository.findAll();
	}
}
