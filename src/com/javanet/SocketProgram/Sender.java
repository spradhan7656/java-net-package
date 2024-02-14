package com.javanet.SocketProgram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender 
{

	public static void main(String[] args) throws Exception
	{ 
		DatagramSocket ds = new DatagramSocket();
		String str="Welcome to NPTEL";
		InetAddress ip =InetAddress.getByName("192.168.43.9");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,300);
		ds.send(dp);
		ds.close();
	}

}
