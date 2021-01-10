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

	public void edit()
	{
		String temp=null;
		System.out.println("Enter the First Name of the record u want to Edit");
		temp=scanner.next();
		if(book.isEmpty())
		{
			System.out.println("No records to edit");
			return;
		}
		
			for(int i=0;i<book.size();i++)
			{
				if(book.get(i).getFirstName().equals(temp))
				{
					InformationInput Info=new InformationInput();
					
					System.out.println(temp);
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
					System.out.println("Enter your phone number");
					Info.setPhoneNumber(scanner.next());
					System.out.println("Enter your Email");
					Info.setEmailId(scanner.next());
					book.remove(i);
					book.add(i, Info);
					break;
				}
				
			}		
	}
	
	public void delete()
	{
		String temp=null;
		System.out.println("Enter the First Name of the record u want ot delete");
		temp=scanner.next();
		if(book.isEmpty())
		{
			System.out.println("No records to delete");
			return;
		}
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getFirstName().equals(temp))
			{
				book.remove(i);
				break;
			}
		}
	}
	
	
}
