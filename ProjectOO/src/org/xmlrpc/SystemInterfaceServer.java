package org.xmlrpc;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class SystemInterfaceServer {
    private static final int port = 8081;

    public static void main(String[] args) throws Exception {
        WebServer webServer = new WebServer(port);
      
        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
      
        PropertyHandlerMapping phm = new PropertyHandlerMapping();
        addHandlers(phm);
    
        xmlRpcServer.setHandlerMapping(phm);
      
        XmlRpcServerConfigImpl serverConfig =
            (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
        serverConfig.setEnabledForExtensions(true);
        serverConfig.setContentLengthOptional(false);

        webServer.start();
    }

	private static void addHandlers(PropertyHandlerMapping phm)
			throws XmlRpcException {
		
		phm.addHandler("Calculator",
        		org.xmlrpc.system_interface.Calculator.class);
		
		
		phm.addHandler("SystemInterface", org.SystemInterface.class);
	}
}