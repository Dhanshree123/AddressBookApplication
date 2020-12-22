package com.addressBookApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressBookApp.dto.AddressBookDTO;
import com.addressBookApp.exceptions.AddressBookException;
import com.addressBookApp.model.AddressBookData;
import com.addressBookApp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
	
	@Autowired
	private AddressBookRepository addressbookRepository;

	private List<AddressBookData> contactList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return contactList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		return contactList.stream()
				   .filter(contactData -> contactData.getId() == id)
				   .findFirst()
				   .orElseThrow(() -> new AddressBookException("Contact Not Found"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = new AddressBookData(addressBookDTO);
		contactList.add(contactData);
		log.debug("Contact Data: "+contactData);
		return addressbookRepository.save(contactData);
	}

	@Override
	public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
		AddressBookData contactData = this.getAddressBookDataById(id);
		contactData.setFullName(addressBookDTO.fullName);
		contactData.setAddress(addressBookDTO.address);
		contactData.setCity(addressBookDTO.city);
		contactData.setState(addressBookDTO.state);
		contactData.setZip(addressBookDTO.zip);
		contactData.setPhoneNumber(addressBookDTO.phoneNumber);
		contactList.set(id-1,contactData);
		return contactData;
	}
	
	@Override
	public void deleteAddressBookData(int id) {
		contactList.remove(id-1);
	}
}
