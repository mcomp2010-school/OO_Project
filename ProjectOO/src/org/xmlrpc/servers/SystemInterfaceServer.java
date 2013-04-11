package org.xmlrpc.servers;

import java.io.IOException;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class SystemInterfaceServer {
    private static final int port = 8081;

    public static void main(String[] args) throws Exception {
   
    }

    
    
    public static void createAndStart(){
    	System.out.println("Started SystemInterfaceServer");
        WebServer webServer = new WebServer(port);
        
        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
      
        PropertyHandlerMapping phm = new PropertyHandlerMapping();
        try {
			addHandlers(phm);
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
        xmlRpcServer.setHandlerMapping(phm);
      
        XmlRpcServerConfigImpl serverConfig =
            (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
        serverConfig.setEnabledForExtensions(true);
        serverConfig.setContentLengthOptional(false);

        try {
			webServer.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	private static void addHandlers(PropertyHandlerMapping phm)
			throws XmlRpcException {
		
		
		
		
		phm.addHandler("SystemInterface", org.SystemInterface.class);
	}
}