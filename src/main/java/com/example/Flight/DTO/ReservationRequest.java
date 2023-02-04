package com.example.Flight.DTO;

public class ReservationRequest {
	private long flightId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	
	private long cardNumber;
	private String nameOnTheCard;
	private String cvvCode;
	private String expireDate;
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardnumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getnameOnTheCard() {
		return nameOnTheCard;
	}
	public void setCardHolderName(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public String getCvvCode() {
		return cvvCode;
	}
	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
