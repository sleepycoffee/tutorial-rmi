package com.sundance.rmi.server.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.sundance.rmi.server.Message;

public class MessageImpl extends UnicastRemoteObject implements Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2408103878139304694L;

	public MessageImpl() throws RemoteException {       
	}

	public void sayHello(String name) throws RemoteException {
		System.out.println("Hello " + name);
	}

}