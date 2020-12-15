package com.addressBookApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.addressBookApp.dto.AddressBookDTO;
import com.addressBookApp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> contactList = new ArrayList<>();
		contactList.add(new AddressBookData(1, new AddressBookDTO("Seema", "Singh","23 abc colony")));
		return contactList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Seema", "Singh","23 abc colony"));
		return contactData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1,addressBookDTO);
		return contactData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1,addressBookDTO);
		return contactData;
	}
	
	@Override
	public void deleteAddressBookData(int id) {

	}
}
