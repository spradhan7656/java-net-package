package com.javanet.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClientChat 
{
	public static void main(String[] args)throws Exception 
	{
		Socket s=new Socket("localhost",4444);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("stop"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			str2=dis.readUTF();
			System.out.println("Server say: "+str2);	
		}
		dout.close();
		s.close();
	}
}
