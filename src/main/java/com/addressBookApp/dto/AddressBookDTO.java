package com.addressBookApp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Name Invalid")
	public String fullName;
	
	@Pattern(regexp = "[A-Za-z,/:.0-9\\s]{3,}", message="Address Invalid")
	public String address;

	@NotNull(message="city should not be Empty")
	public String city;
	
	@NotNull(message="state should not be Empty")
	public String state;
	
	@Pattern(regexp = "^[0-9]{6}$" ,message="Zip Invalid")
	public String zip;
	
	@Pattern(regexp = "^[1-9][0-9]{9}$", message="Phone Number Invalid")
	public String phoneNumber;
	
	public AddressBookDTO(String fullName, String address,String city,String state,String zip,String phoneNumber) {
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
