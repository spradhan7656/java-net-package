package com.javanet.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Mychat 
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss= new ServerSocket(3305,1,InetAddress.getByName("192.168.43.64"));
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("stop"))
		{
			str1=dis.readUTF();
			System.out.println("Client say: "+str1);
			str2=br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		dis.close();
		s.close();
		ss.close();
	}
}
