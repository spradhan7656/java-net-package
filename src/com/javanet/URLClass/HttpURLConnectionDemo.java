package com.javanet.URLClass;

import java.net.*;
import java.io.*;
public class HttpURLConnectionDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
			URL url=new URL("https://nptel.ac.in/course.php");
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			for(int i=1;i<=8;i++)
			{
				System.out.println(huc.getHeaderField(i)+"  "+huc.getHeaderField(i));
			}
			huc.disconnect();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
