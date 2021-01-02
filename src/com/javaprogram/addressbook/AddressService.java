package com.javaprogram.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressService {
	
	
	ArrayList<InformationInput> book =new ArrayList<InformationInput>();
	Scanner scanner = new Scanner(System.in);
	
	public void add()
	{	
		InformationInput Info = new InformationInput();
		
		System.out.println("Enter First name:");		
		Info.setFirstName(scanner.next());
		
		System.out.println("Enter last name:");		
		Info.setLastName(scanner.next());
		
		System.out.println("Enter your address:");
		Info.setAddress(scanner.next());
		
		System.out.println("Enter your city:");
		Info.setCity(scanner.next());
		
		System.out.println("Enter your state:");
		Info.setState(scanner.next());
		
		System.out.println("Enter your ZIP code:");
		Info.setZip(scanner.next());
		
		System.out.println("Enter your phone number:");
		Info.setPhoneNumber(scanner.next());
		
		System.out.println("Enter your emailid:");
		Info.setEmailId(scanner.next());
	
		book.add(Info);
		
	
	}
	
	public void display()
	{
		for(int i=0;i<book.size();i++)
		{
			System.out.println(book.get(i));
		}
	}

}
