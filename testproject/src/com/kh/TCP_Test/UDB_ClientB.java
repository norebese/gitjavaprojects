package com.kh.TCP_Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDB_ClientB {
	public static void main(String[]args) {
		System.out.println("Client B");
		
		DatagramSocket ds = null;
		try {
			ds=new DatagramSocket(20000);
		}catch(SocketException e) {
			e.printStackTrace();
		}
		//데이터 수신 port 20000
		byte[] receiveDate = new byte[65000];
		DatagramPacket receivePacket= new DatagramPacket(receiveDate, receiveDate.length);
		try {
			ds.receive(receivePacket);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("수신 데이터 : "+new String(receivePacket.getData(), receivePacket.getOffset(),receivePacket.getLength()));
		
		//데이터 발송 port 10000
		InetSocketAddress is = new InetSocketAddress("localhost",10000);
		
		byte[] sendData = "반갑습니다".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,is);
		
		System.out.println("발송 데이터 : "+new String(sendPacket.getData(), sendPacket.getOffset(),sendPacket.getLength()));
		
		try {
			ds.send(sendPacket);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
