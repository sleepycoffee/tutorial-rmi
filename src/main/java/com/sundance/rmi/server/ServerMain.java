package com.sundance.rmi.server;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.sundance.rmi.server.impl.MessageImpl;
 
public class ServerMain {
     
    public static void main(String[] args) throws UnknownHostException {
    	
    	String hostname = InetAddress.getLocalHost().getHostAddress();
    	System.out.println("this host IP is " + hostname);
        
        try {
            // create on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);
             
            // create a new service named myMessage
            registry.rebind("message", new MessageImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }     
        
        System.out.println("system is ready");
        
    }
}
