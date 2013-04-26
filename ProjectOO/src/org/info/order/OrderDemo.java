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
		Menu MenuObj= new Menu();
		MenuObj.loadXML("data\\Menu.xml");
		
		Order Orders=new Order();
		
		Orders.placeOrder(MenuObj.getItemByIDs("0,4,5,9"));
		Orders.placeOrder(MenuObj.getItemByIDs("0,1"));
		Orders.placeOrder(MenuObj.getItemByIDs("5,9"));

		System.out.println(Orders);
		
	}

}
