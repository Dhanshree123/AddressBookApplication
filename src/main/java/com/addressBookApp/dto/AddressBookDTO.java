package com.addressBookApp.dto;

import lombok.ToString;

public @ToString class AddressBookDTO {
	public String firstName;
	public String lastName;
	public String address;

	public AddressBookDTO(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public AddressBookDTO(){
		
	}/*
	@Override
	public String toString() {
		return "AddressBookDTO [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + address + "]";
	}
	*/
}
