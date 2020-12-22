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
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressbookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		return addressbookRepository
				   .findById(id)
				   .orElseThrow(() -> new AddressBookException("Contact Not Found"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = new AddressBookData(addressBookDTO);
		log.debug("Contact Data: "+contactData);
		return addressbookRepository.save(contactData);
	}

	@Override
	public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
		AddressBookData contactData = this.getAddressBookDataById(id);
		contactData.updateAddressBookData(addressBookDTO);
		return addressbookRepository.save(contactData);
	}
	
	@Override
	public void deleteAddressBookData(int id) {
		AddressBookData contactData = this.getAddressBookDataById(id);
		addressbookRepository.delete(contactData);
	}
}
