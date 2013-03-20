package org.info.order;

import java.util.ArrayList;

import org.info.menu.MenuItem;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderItem.
 */
public class OrderItem {
	/** The order id. */
	private Integer orderID;
	/** The Menu items. */
	private ArrayList<MenuItem> MenuItems;
	/** The Time ordered. */
	private String TimeOrdered;
	
	
	
	
	public Integer getOrderID() {
		return orderID;
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return MenuItems;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public void setMenuItems(ArrayList<MenuItem> menuItems) {
		MenuItems = menuItems;
	}
	
	
	
	
}
