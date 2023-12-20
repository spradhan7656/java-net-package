package com.javanet.URLClass;

import java.net.*;
public class URLClass 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			URL url=new URL("https://nptel.ac.in/course.php");
			System.out.println("Protocol="+url.getProtocol());
			System.out.println("Host Name="+url.getHost());
			System.out.println("Port Number"+url.getPort());
			System.out.println("File Name"+url.getFile());
			System.out.println("Ex="+url.toExternalForm());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
