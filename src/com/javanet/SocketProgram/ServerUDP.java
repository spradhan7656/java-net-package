package com.javanet.SocketProgram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerUDP 
{
	public static void main(String[] args)throws Exception 
	{
		DatagramSocket ds=new DatagramSocket(3456);
		System.out.println("Server Started:....");
		byte b[]=new byte[1000];
		DatagramPacket dp=new DatagramPacket(b,b.length);
		
		ds.receive(dp);
		String str=new String (dp.getData());
		System.out.println("Received:"+str);
		Thread.sleep(2000);
		//send
		String msg="Hey i am server";
		byte b1[]=msg.getBytes();
		InetAddress ip1=InetAddress.getLocalHost();
		/**
		 * <p> why creating new packet because both send and receive one packet is not possible</p>
		 */
		DatagramPacket dp1=new DatagramPacket(b1,b1.length,ip1,dp.getPort());//Client has no port find port getPort();
		ds.send(dp1);
		ds.close();
		
	}
}
 