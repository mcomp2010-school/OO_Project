package org.client;


import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.xmlrpc.SystemInterface;


public class Client {
    public static void main(String[] args) throws Exception {

    	SystemInterface SystemInterfaceObj=new SystemInterface();
        
    	System.out.println(SystemInterfaceObj.getCompleteMenu());
    }
}