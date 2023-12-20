package com.javanet.URLClass;

import java.net.InetAddress;
import java.util.Scanner;

public class FindIP 
{
	
	public static void main(String[] args) 
	{
		
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Domain Name");
			
			String s=sc.nextLine();
			
			InetAddress ip=InetAddress.getByName(s);
			System.out.println("The Host are "+ip.getHostName());
			System.out.println("The IP Address are "+ip.getHostAddress());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}
}
