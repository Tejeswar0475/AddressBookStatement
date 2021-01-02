package com.javaprogram.addressbook;

public class AddressBook {


	public static void main(String[] args) {

		System.out.println("Welcome to address book program");
		AddressService addressService=new AddressService();
		addressService.add();
		addressService.display();

	}

}
