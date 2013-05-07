package org.info.order;

import java.util.Iterator;

import org.info.menu.Menu;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderDemo.
 */
public class OrderDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		boolean useFile = true;
		Menu MenuObj= new Menu();
		MenuObj.loadXML("data\\Menu.xml");
						
		Order Orders = new Order(1);
		Order Orders2 = new Order(2);
		
		if(useFile){
			Orders.loadXML("data\\SampleOrder.xml");
			Orders2.loadXML("data\\SampleOrder2.xml");
		}
		else{		
		Orders.placeOrder(MenuObj.getItemByIDs("0,4,5,9"));
		Orders.placeOrder(MenuObj.getItemByIDs("0,1"));
		Orders.placeOrder(MenuObj.getItemByIDs("5,9,10,11"));
		Orders.saveXML("data\\SampleOrder.xml");
		
		Orders2.placeOrder(MenuObj.getItemByIDs("1,2,3,10"));
		Orders2.placeOrder(MenuObj.getItemByIDs("4,6,8"));
		Orders2.placeOrder(MenuObj.getItemByIDs("4,8,1,2"));
		Orders2.saveXML("data\\SampleOrder2.xml");	
		}
		
		System.out.println(Orders);
		System.out.println("\n");
		System.out.println(Orders2);		
	}
}
