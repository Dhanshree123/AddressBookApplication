package com.addressBookApp.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="First Name Invalid")
	public String fullName;
	
	@Pattern(regexp = "[A-Za-z,/:.0-9\\s]{3,}", message="Address Invalid")
	public String address;

	public String city;
	public String state;
	public int zip;
	public long phoneNumber;
	
	public AddressBookDTO(String fullName, String address,String city,String state,int zip,long phoneNumber) {
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.state=state;
		this.zip = zip;
		this.phoneNumber=phoneNumber;
	}

	public AddressBookDTO(){
		
	}
}
