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

import com.wizardtech.tripsdb.model.UserCard;
import com.wizardtech.tripsdb.service.UserCardService;
@RestController
public class UserCardController {
	@Autowired
	private UserCardService userCardService;
	
	@RequestMapping("/user/card")
	public ResponseEntity<List<UserCard>> findAll() {
		try {
			return new ResponseEntity<>(userCardService.findAll(), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/user/card/email/{email}")
	public ResponseEntity<UserCard> getCardByemail(@PathVariable("email") String email) {
		try {
			return new ResponseEntity<>(userCardService.getCardByEmail(email), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/user/card/")
	public ResponseEntity<String> AddCard(@RequestBody UserCard userCard ) {
		try {
			userCardService.AddCard(userCard);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
