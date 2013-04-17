package org.xmlrpc;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class SystemInterface {
    private XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl(); 
    private XmlRpcClient client = new XmlRpcClient();
    
    public SystemInterface(){
    	
    	try {
			config.setServerURL(new URL("http://127.0.0.1:8081/xmlrpc"));
			client.setConfig(config);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    }
    
    public Integer add(Integer x, Integer y) throws XmlRpcException{
    	Object[] params = new Object[]{x, y};
        Integer result = (Integer) client.execute("Calculator.add", params);
        
        return result;
    }
    
    
    public String getCompleteMenu() throws XmlRpcException{
    	 String resultMenu= (String) client.execute("SystemInterface.getGetCompleteMenu",new Object[]{});
    	 return resultMenu;
    }
    
    public String getTables() throws XmlRpcException{
   	 String result= (String) client.execute("SystemInterface.getTables",new Object[]{});
   	 return result;
   }
    
   
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
