package org.info.offer;
import org.info.order.Order;
// TODO: Auto-generated Javadoc
/**
 * The Class OfferItem.
 */
public class OfferItem {
	
	/** The menu item category. */
	private String menuItemCategory;
	
	/** The discount percentage. */
	private double discountPercentage;
	
	/** The offer item name. */
	private String offerItemName;  
	
	/** The number of times applied. */
	private int numberOfTimesApplied;	//used for offers like $5 off two entrees in an order
	
	/**
	 * Instantiates a new offer item.
	 *
	 * @param menuItemCategory the menu item category
	 * @param discountPercentage the discount percentage
	 * @param offerItemName the offer item name
	 * @param numberOfTimesApplied the number of times applied
	 */
	public OfferItem (String menuItemCategory, double discountPercentage, String offerItemName,
			int numberOfTimesApplied)
	{
		this.menuItemCategory = menuItemCategory;
		this.discountPercentage = discountPercentage;
		this.offerItemName = offerItemName;
		this.numberOfTimesApplied = numberOfTimesApplied;
	}		
}
