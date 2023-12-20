package com.javanet.URLClass;

import java.io.InputStream;
import java.net.*;

public class URLConnectionClass
{

	public static void main(String[] args) 
	{
		try 
		{
			URL url=new URL("https://nptel.ac.in/course.php");
			URLConnection urlc=url.openConnection();
			InputStream stream= urlc.getInputStream();
			int b;
			while((b=stream.read())!= -1)
			{
				System.out.print((char)b);
			}
			stream.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
