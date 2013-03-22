package org.info.order;

import java.util.ArrayList;
import java.util.TreeMap;

import org.info.menu.MenuItem;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
public class Order {
	
	/** The order id. */
	private Integer orderID = 0;
	
	/** The orders. */
	private TreeMap<Integer,OrderItem> orders=new TreeMap<Integer,OrderItem>();

	/**
	 * Place order.
	 *
	 * @return the integer
	 */
	public Integer placeOrder(ArrayList<MenuItem> menuItems) {
		orders.put(orderID, new OrderItem(orderID,menuItems));
		orderID++;
		return orderID-1;
	}


	/**
	 * Gets the order by id.
	 *
	 * @return the order by id
	 */
	public OrderItem getOrderByID(Integer inputID) {
		return orders.get(inputID);
	}


	/**
	 * Removes the orderby id.
	 */
	public void removeOrderbyID(Integer inputID) {
		orders.remove(inputID);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [orders=" + orders + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		return true;
	}
	
}
