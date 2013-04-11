package org.xmlrpc;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

// TODO: Auto-generated Javadoc
/**
 * The Class SystemInterfaceServer.
 */
public class SystemInterfaceServer {
    
    /** The Constant port. */
    private static final int port = 8081;

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws Exception the exception
     */
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

	/**
	 * Adds the handlers.
	 *
	 * @param phm the phm
	 * @throws XmlRpcException the xml rpc exception
	 */
	private static void addHandlers(PropertyHandlerMapping phm)
			throws XmlRpcException {
				
		
		phm.addHandler("SystemInterface", org.SystemInterface.class);
	}
}