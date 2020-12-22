package com.addressBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressBookApp.model.AddressBookData;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

}