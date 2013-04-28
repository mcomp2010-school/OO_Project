package org.info.offer;

import org.info.menu.Menu;
import org.info.order.Order;

public class OfferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Offer offerObj = new Offer("VIP Discounts");
		
		boolean useFile = false;
		
		//load Offers
		if(useFile)
		{
			offerObj.loadXML("data\\Offer.xml");
		}
		else
		{
			offerObj.addOfferItem("Entree", .20, 1, "20% Off 1 Entree");
			offerObj.addOfferItem("Dessert", 1, 1, "1 free dessert");
			offerObj.addOfferItem("Drink", .5, 2 , "50% Off 2 Drinks");
			offerObj.saveXML("data\\Offer.xml");
		}
		
		//Load Menu and Orders
		Menu MenuObj= new Menu();
		MenuObj.loadXML("data\\Menu.xml");
		
		Order Orders=new Order();
		
		Orders.placeOrder(MenuObj.getItemByIDs("0,4,5,9"));
		Orders.placeOrder(MenuObj.getItemByIDs("0,1"));
		Orders.placeOrder(MenuObj.getItemByIDs("5,9,10,11"));		
		//Show offers
		System.out.println(offerObj);
		
		System.out.println(offerObj.getOfferName());
		for(OfferItem i : offerObj.GetOfferItems())
		{
			System.out.println(i.getOfferItemName() + " " + i.getOfferItemCategory() + " " + 
					i.getDiscountPercent() * 100 + "%" + " " + i.getNumOfTimesApplied());
		}		
						
		//Show order before discounts
		System.out.print("\n");
		System.out.println(Orders);
		
		//apply offers and show order after discounts
		offerObj.applyOffers(Orders.getOrderByID(0));
		offerObj.applyOffers(Orders.getOrderByID(1));
		offerObj.applyOffers(Orders.getOrderByID(2));
		
		System.out.print("\n");
		System.out.println(Orders);
	}
}
