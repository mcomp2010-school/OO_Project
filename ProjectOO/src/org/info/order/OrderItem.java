package org.info.order;

import java.util.ArrayList;

import org.info.menu.MenuItem;
import org.joda.time.DateTime;

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
	private DateTime timeOrdered;
	
	
	/**
	 * Instantiates a new order item.
	 *
	 * @param orderID the order id
	 * @param menuItems the menu items
	 */
	public OrderItem(Integer orderID, ArrayList<MenuItem> menuItems) {
		super();
		this.orderID = orderID;
		MenuItems = menuItems;
		this.timeOrdered=new DateTime();
		
	}

	/**
	 * Gets the order id.
	 *
	 * @return the order id
	 */
	public Integer getOrderID() {
		return orderID;
	}
	
	/**
	 * Gets the menu items.
	 *
	 * @return the menu items
	 */
	public ArrayList<MenuItem> getMenuItems() {
		return MenuItems;
	}
	
	/**
	 * Sets the order id.
	 *
	 * @param orderID the new order id
	 */
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	
	/**
	 * Sets the menu items.
	 *
	 * @param menuItems the new menu items
	 */
	public void setMenuItems(ArrayList<MenuItem> menuItems) {
		MenuItems = menuItems;
	}

	@Override
	public String toString() {
		return "OrderItem [orderID=" + orderID + ", MenuItems=" + MenuItems
				+ ", timeOrdered=" + timeOrdered + "]";
	}
	
	
	
	
	
	
}
