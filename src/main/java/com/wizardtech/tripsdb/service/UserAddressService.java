package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.UserAddress;
import com.wizardtech.tripsdb.repository.UserAddressRepository;

@Service
public class UserAddressService {
	@Autowired
	UserAddressRepository userAddressRepository;

	
	public List<UserAddress> findAll(){
		return userAddressRepository.findAll();
	}

	public UserAddress getAddressByEmail(String email) {
		return userAddressRepository.getAddressByEmail(email);
	}

	public void AddAddress(UserAddress userAddress) {
		UserAddress address = getAddressByEmail(userAddress.getEmail());
		if(address != null && address.getEmail().equals(userAddress.getEmail())) {
			userAddressRepository.deleteByemail(userAddress.getEmail());
		}
		userAddressRepository.save(userAddress);
	}
}