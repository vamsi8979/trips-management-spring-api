package com.wizardtech.tripsdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.UserAddress;
import com.wizardtech.tripsdb.service.UserAddressService;
@RestController
public class UserAddressController {
	@Autowired
	private UserAddressService userAddressService;
	
	@RequestMapping("/user/address")
	public ResponseEntity<List<UserAddress>> findAll() {
		try {
			return new ResponseEntity<>(userAddressService.findAll(), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/user/address/email/{email}")
	public ResponseEntity<UserAddress> getAddressByemail(@PathVariable("email") String email) {
		try {
			return new ResponseEntity<>(userAddressService.getAddressByEmail(email), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/user/address/")
	public ResponseEntity<String> AddAddress(@RequestBody UserAddress userAddress ) {
		try {
			userAddressService.AddAddress(userAddress);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
