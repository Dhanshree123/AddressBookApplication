package com.addressBookApp.model;

import com.addressBookApp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	int id;
	String fullName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	
	public AddressBookData(int id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.updateAddressBookData(addressBookDTO);
	}

	private void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.fullName = addressBookDTO.fullName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state=addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.phoneNumber=addressBookDTO.phoneNumber;
	}

}
