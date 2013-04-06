package org.info.offer;
import org.info.order.Order;
/**
 * The Class OfferItem.
 */
public class OfferItem {
	
	private String menuItemCategory;
	private double discountPercentage;
	private String offerItemName;  
	private int numberOfTimesApplied;	//used for offers like $5 off two entrees in an order
	
	public OfferItem (String menuItemCategory, double discountPercentage, String offerItemName,
			int numberOfTimesApplied)
	{
		this.menuItemCategory = menuItemCategory;
		this.discountPercentage = discountPercentage;
		this.offerItemName = offerItemName;
		this.numberOfTimesApplied = numberOfTimesApplied;
	}		
}
