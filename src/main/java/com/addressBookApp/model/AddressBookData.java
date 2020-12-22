package com.addressBookApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.addressBookApp.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="addressBook_contacts")
public @Data class AddressBookData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	int id;
	
	String fullName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	
	public AddressBookData() {

	}
	
	public AddressBookData(AddressBookDTO addressBookDTO) {
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
