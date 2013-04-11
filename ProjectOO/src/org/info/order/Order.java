package org.info.order;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.info.comment.CommentItem;
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
	 * @param menuItems the menu items
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
	 * @param inputID the input id
	 * @return the order by id
	 */
	public OrderItem getOrderByID(Integer inputID) {
		return orders.get(inputID);
	}


	/**
	 * Removes the orderby id.
	 *
	 * @param inputID the input id
	 */
	public void removeOrderbyID(Integer inputID) {
		orders.remove(inputID);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder outputBuilder = new StringBuilder();

		for (Map.Entry<Integer, OrderItem> entry : this.orders
				.entrySet()) {
			Integer key = entry.getKey();
			OrderItem value = entry.getValue();

			// System.out.println(key + " => " + value);
			outputBuilder.append(value + "\n");
		}

		return outputBuilder.toString().trim();
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
