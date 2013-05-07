package org.info.order;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.info.comment.CommentItem;
import org.info.menu.MenuItem;
import org.interfaces.XStreamXMLI;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
public class OrderManager implements XStreamXMLI {
	
	/** The order id. */
	private Integer orderID = 0;
	
	/**The table number*/
	private Integer tableNumber;
		
	/** The orders. */
	@XStreamAlias("OrderList")
	private TreeMap<Integer,OrderItem> orders=new TreeMap<Integer,OrderItem>();

	public OrderManager(Integer tableNum)
	{
		this.tableNumber = tableNum;
	}
	
	public OrderManager() {
		// TODO Auto-generated constructor stub
	}

	/**Get the table number*/	
	public Integer GetTableNumber()
	{
		return this.tableNumber;
	}
	
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

	public TreeMap<Integer, OrderItem> getAllOrders()
	{
		return orders;		
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
		OrderManager other = (OrderManager) obj;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		return true;
	}


	@Override
	public void loadXML(String FileName) {
		XStream xstream = new XStream();
		xstream.alias("OrderItem", OrderItem.class);
		xstream.autodetectAnnotations(true);
		
		this.orders.clear();
		
		File file = new File(FileName);
		String lines = null;
		try{
			lines = FileUtils.readFileToString(file);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		TreeMap<Integer, OrderItem> temptable = (TreeMap<Integer,OrderItem>)xstream.fromXML(lines.toString());
		this.orders = temptable;
	}
		

	@Override
	public String getXML() {
		XStream xstream = new XStream();
		xstream.alias("OrderItem",OrderItem.class);
		xstream.autodetectAnnotations(true);
		String xml = xstream.toXML(this.orders);
		return xml;		
	}


	@Override
	public void saveXML(String FileName) {
		File file = new File(FileName);
		try{
			FileUtils.writeStringToFile(file, this.getXML());
		}catch(IOException e){
			e.printStackTrace();
		}
	}		
}
