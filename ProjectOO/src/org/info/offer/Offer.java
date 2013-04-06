package org.info.offer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.info.order.Order;
import org.shared.XStreamXML;

import com.thoughtworks.xstream.XStream;

// TODO: Auto-generated Javadoc
/**
 * The Class Offer.
 */
public class Offer implements XStreamXML{

	private String offerName; //General offer name. Separate from offerItem names
	private List<OfferItem> offerItemList;

	private Offer(String offerName)
	{
		this.offerItemList = new ArrayList<OfferItem>();
		this.offerName = offerName;
	}
	
	/**
	 * Adds a offer item to the offer collection*/
	public void addOfferItem(String menuItemCategory, double discountPercentage, int timesApplied, 
			String offerItemName)
	{
		OfferItem item = new OfferItem(menuItemCategory, discountPercentage, offerItemName, timesApplied);
		offerItemList.add(item);
	}
	
	/**
	 * Remove offer item from offer collection
	 */
	public void removeOfferItem(int index)
	{
		offerItemList.remove(index);
	}
	
	/**
	 * Apply all offers in the list to the order
	 * */
	public void applyOffers(Order order)	
	{
		this.offerItemList = new ArrayList<OfferItem>();
	}
	
	/**
	 * Adds a offer item to the offer collection*/
	public void addOfferItem(String menuItemType, double discountPercentage, int timesApplied)
	{
		//TODO: Implement logic to iterate and apply each offer
	}
	
	
	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#loadXML(java.lang.String)
	 */
	@Override
	public void loadXML(String FileName) {
		// TODO need to implement- Can copy paste code from Menu
		
	}

	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#getXML()
	 */
	@Override
	public String getXML() {
		XStream xstream = new XStream(); 
		// TODO need to change line below for new class
		//xstream.alias("MenuItem", MenuItem.class);
		
		xstream.autodetectAnnotations(true);
		
		// TODO need to change line below for new class
		String xml = "NEED TO CHANGE"; //xstream.toXML(this.MenuList);
		
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
