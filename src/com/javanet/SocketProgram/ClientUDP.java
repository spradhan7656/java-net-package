package com.javanet.SocketProgram;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP 
{
	public static void main(String[] args) throws Exception 
	{
		DatagramSocket ds=new DatagramSocket();
		System.out.println("Client Straded.......");
		//send
		String msg="hye i am client";
		byte []b=msg.getBytes();
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(b,b.length,ip,3456);
		ds.send(dp);
		System.out.println("Packet send.....");
		//receive
		byte b1[]=new byte[1000];
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		ds.receive(dp1);
		String str=new String(dp1.getData());
		System.out.println("Receiveing ..."+str);
		ds.close();  
	}
}
