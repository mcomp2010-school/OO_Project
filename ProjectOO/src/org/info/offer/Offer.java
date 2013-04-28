package org.info.offer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.info.menu.MenuItem;
import org.info.order.Order;
import org.info.order.OrderItem;
import org.interfaces.XStreamXMLI;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

// TODO: Auto-generated Javadoc
/**
 * The Class Offer.
 */
public class Offer implements XStreamXMLI{

	/** The offer name. */
	private String offerName; //General offer name. Separate from offerItem names
	
	/** The offer item list. */
	@XStreamAlias("OfferItem")
	private ArrayList<OfferItem> offerItemList;

	/**
	 * Instantiates a new offer.
	 *
	 * @param offerName the offer name
	 */
	public Offer(String offerName)
	{
		this.offerItemList = new ArrayList<OfferItem>();
		this.offerName = offerName;
	}
	
	public ArrayList<OfferItem> GetOfferItems()
	{
		return this.offerItemList;
	}
	
	public String getOfferName()
	{
		return this.offerName;
	}
	
	public void setOfferName(String name)
	{
		this.offerName = name;
	}
	
	/**
	 * Adds a offer item to the offer collection.
	 *
	 * @param menuItemCategory the menu item category
	 * @param discountPercentage the discount percentage
	 * @param timesApplied the times applied
	 * @param offerItemName the offer item name
	 */
	public void addOfferItem(String menuItemCategory, double discountPercentage, int timesApplied, 
			String offerItemName)
	{
		OfferItem item = new OfferItem(menuItemCategory, discountPercentage, offerItemName, timesApplied);
		offerItemList.add(item);
	}
	
	/**
	 * Remove offer item from offer collection.
	 *
	 * @param index the index
	 */
	public void removeOfferItem(int index)
	{
		offerItemList.remove(index);
	}
	
	/**
	 * Apply all offers in the list to the order.
	 *
	 * @param order the order
	 */
	public void applyOffers(OrderItem order)	
	{
		for(OfferItem o : offerItemList)
		{
			for(MenuItem m : order.getMenuItems())
			{
				if(o.getNumOfTimesApplied() > 0)
				{
					if(m.getCategory().equalsIgnoreCase(o.getOfferItemCategory()))
					{
						m.setPrice(m.getPrice()-(m.getPrice() * o.getDiscountPercent()));
						o.setNumTimesApplied(o.getNumOfTimesApplied()-1);
					}
				}
				else
					break;
			}
		}
	}
		
	
	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#loadXML(java.lang.String)
	 */
	@Override
	public void loadXML(String FileName) {
		XStream xstream = new XStream();
		xstream.alias("OfferItem", OfferItem.class);
		xstream.autodetectAnnotations(true);		
		
		this.offerItemList.clear();
		
		File file = new File(FileName);
		String lines = null;
		try
		{
			lines = FileUtils.readFileToString(file);
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<OfferItem> tempTable = (ArrayList<OfferItem>)xstream.fromXML(lines.toString());
		this.offerItemList = tempTable;
	}

	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#getXML()
	 */
	@Override
	public String getXML() {
		XStream xstream = new XStream(); 
		xstream.alias("OfferItem", OfferItem.class);
		
		xstream.autodetectAnnotations(true);
		
		String xml = xstream.toXML(this.offerItemList);		
		return xml;
	}

	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#saveXML(java.lang.String)
	 */
	@Override
	public void saveXML(String FileName) {
		File file = new File(FileName);
		try {
			FileUtils.writeStringToFile(file, this.getXML());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
