package com.wizardtech.tripsdb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_card_details")
public class UserCard {
	private String email;
	private String CardNumber;
	private String CardHolderName;
	private String ExpirationMonth;
	private int ExpirationYear;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return CardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		CardHolderName = cardHolderName;
	}
	public String getExpirationMonth() {
		return ExpirationMonth;
	}
	public void setExpirationMonth(String expirationMonth) {
		ExpirationMonth = expirationMonth;
	}
	public int getExpirationYear() {
		return ExpirationYear;
	}
	public void setExpirationYear(int expirationYear) {
		ExpirationYear = expirationYear;
	}
	
}
