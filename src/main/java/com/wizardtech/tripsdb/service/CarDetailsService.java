package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.CarDetails;
import com.wizardtech.tripsdb.repository.CarDetailsRepository;

@Service
public class CarDetailsService {
	@Autowired
	CarDetailsRepository carDetailsRepository;
	
	public List<CarDetails> findAll(){
		return carDetailsRepository.findAll();
	}
}
