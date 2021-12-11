package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.UserCard;
import com.wizardtech.tripsdb.repository.UserCardRepository;

@Service
public class UserCardService {
	@Autowired
	UserCardRepository userCardRepository;
	
	public List<UserCard> findAll(){
		return userCardRepository.findAll();
	}

	public UserCard getCardByEmail(String email) {
		return userCardRepository.findByEmail(email);
	}

	public void AddCard(UserCard userCard) {
		UserCard card = getCardByEmail(userCard.getEmail());
		if(card != null && card.getEmail().equals(userCard.getEmail())) {
			userCardRepository.deleteByemail(userCard.getEmail());
		}
		userCardRepository.save(userCard);
	}
}