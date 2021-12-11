package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.UserProfile;
import com.wizardtech.tripsdb.repository.UserProfileRepository;

@Service
public class UserProfileService {
	@Autowired
	UserProfileRepository userProfileRepository;
	
	public List<UserProfile> findAll(){
		return userProfileRepository.findAll();
	}

	public UserProfile getProfileByEmail(String email) {
		return userProfileRepository.findOneByEmail(email);
	}

	public UserProfile getProfileByNickName(String nickname) {
		return userProfileRepository.getProfileByNickName(nickname);
	}

	public void AddProfile(UserProfile userProfile) {
		UserProfile profile = getProfileByEmail(userProfile.getEmail());
		if(profile != null && profile.getEmail().equals(userProfile.getEmail())) {
			userProfileRepository.deleteByemail(userProfile.getEmail());
		}
		userProfileRepository.save(userProfile);
	}
}