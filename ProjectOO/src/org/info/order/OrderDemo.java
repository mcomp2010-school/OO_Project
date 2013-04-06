package org.info.order;

import java.util.Iterator;

import org.info.menu.Menu;

public class OrderDemo {

	/**
	 * @param args
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
