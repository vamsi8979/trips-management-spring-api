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

import com.wizardtech.tripsdb.model.UserProfile;
import com.wizardtech.tripsdb.service.UserProfileService;
@RestController
public class UserProfileController {
	@Autowired
	private UserProfileService userProfileService;
	
	@RequestMapping("/user/profile")
	public ResponseEntity<List<UserProfile>> findAll() {
		try {
			return new ResponseEntity<>(userProfileService.findAll(), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/user/profile/email/{email}")
	public ResponseEntity<UserProfile> getProfileByemail(@PathVariable("email") String email) {
		try {
			return new ResponseEntity<>(userProfileService.getProfileByEmail(email), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/user/profile/username/{nickname}")
	public ResponseEntity<UserProfile> getProfileByNickName(@PathVariable("nickname") String nickname) {
		try {
			return new ResponseEntity<>(userProfileService.getProfileByNickName(nickname), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/user/profile/")
	public ResponseEntity<String> AddProfile(@RequestBody UserProfile userProfile ) {
		try {
			userProfileService.AddProfile(userProfile);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
