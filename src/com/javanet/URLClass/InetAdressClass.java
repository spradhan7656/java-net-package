package com.javanet.URLClass;

import java.net.InetAddress;

public class InetAdressClass 
{
	public static void main(String[] args) 
	{
		try
		{
			InetAddress ip=InetAddress.getByName("www.google.com");
			System.out.println("Host Name="+ip.getHostName());
			System.out.println("IP address="+ip.getHostAddress());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
