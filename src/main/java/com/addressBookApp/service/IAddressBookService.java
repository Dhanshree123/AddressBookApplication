package com.addressBookApp.service;

import java.util.List;

import com.addressBookApp.dto.AddressBookDTO;
import com.addressBookApp.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookDataById(int id);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int id);
}
