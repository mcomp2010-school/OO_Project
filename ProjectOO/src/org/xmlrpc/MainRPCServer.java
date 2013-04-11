package org.xmlrpc;

import org.xmlrpc.servers.CustomerInterfaceServer;
import org.xmlrpc.servers.SystemInterfaceServer;

public class MainRPCServer {

	   public static void main(String[] args) throws Exception {
		   System.out.println("Starting Servers\n=================");
		   
		   SystemInterfaceServer.createAndStart();
		   CustomerInterfaceServer.createAndStart();
		   
		   System.out.println("========================");
		   System.out.println("Running...");
	   }
	   
	   
}
