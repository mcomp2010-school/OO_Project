package org.info;

import java.util.ArrayList;

import org.info.comment.CommentManager;
import org.info.menu.Menu;
import org.info.menu.MenuItem;
import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.PriceMenuIterator;
import org.info.offer.OfferManager;
import org.info.order.OrderManager;
import org.info.tab.TabManager;
import org.info.table.TableManager;
import org.interfaces.MenuIteratorI;
import org.party.PartyManager;
import org.shared.performance.Timing;

// TODO: Auto-generated Javadoc
/**
 * The Class InformationProvider.
 */
public class InformationProvider {
	
	/** The Stop watch performance. */
	private static boolean StopWatchPerformance=true;
	
	/** The Clock1. */
	private static Timing Clock1=new Timing();
	
	/** The Menu obj. */
	private Menu MenuObj= new Menu();
	
	/** The Tables. */
	private TableManager tableManagerObj=new TableManager();
	
	private PartyManager PartiesObj=new PartyManager();
	private CommentManager CommentsObj=new CommentManager();
	private TabManager TabsMgr=new TabManager();
	private OrderManager OrdersObj=new OrderManager();
	private OfferManager offerVIPObj = new OfferManager("VIP Discounts");
	
	/** The singleton object. */
	private static InformationProvider singletonObject;

	/**
	 * Instantiates a new information provider.
	 */
	private InformationProvider() {
		Clock1.start();
		
		//Loading Persistent Data
		//Adding MenuItems
		MenuObj.loadXML("data\\Menu.xml");
		
		//Adding Tables
		tableManagerObj.loadXML("data\\tables\\table_conf_1.xml");
		
		if(StopWatchPerformance)System.err.println(this.getClass().getName()+".InformationProvider():"+Clock1.stop_SecDouble());
	}
	
	/**
	 * Gets the singleton object.
	 *
	 * @return the singleton object
	 */
	public static InformationProvider getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new InformationProvider();
		}
		return singletonObject;
	}
	
	public OrderManager getOrdersObj() {
		return OrdersObj;
	}

	public Menu getMenuObj() {
		return MenuObj;
	}

	public TabManager getTabsMgr() {
		return TabsMgr;
	}

	public CommentManager getCommentMgr(){
		return this.CommentsObj;
	}
	
	public PartyManager getPartyMgr(){
		return this.PartiesObj;
	}
	/**
	 * Tables.
	 *
	 * @return the table manager
	 */
	public TableManager Tables(){
		return this.tableManagerObj;
	}
	/**
	 * Complete menu.
	 *
	 * @return the menu
	 */
	public Menu CompleteMenu(){
		Menu tempMenu= new Menu();
		MenuIteratorI CompleteMenuIterator=new CompleteMenuIterator(MenuObj);
		
		while (CompleteMenuIterator.hasNext()) {  
			CompleteMenuIterator.hasNext(); // extra call should have no effect  
			tempMenu.addItem((MenuItem)CompleteMenuIterator.next());  
		 } 
		return tempMenu;
	}
	
	/**
	 * Gets the unique ingredients.
	 *
	 * @return the unique ingredients
	 */
	public String[] getUniqueIngredients(){
		return this.MenuObj.getUniqueIngredients();
	}
	
	/**
	 * Heart healthy menu.
	 *
	 * @return the menu
	 */
	public Menu HeartHealthyMenu(){
		Menu tempMenu= new Menu();
		MenuIteratorI HeartHealthyMenuIterator=new HeartHealthyMenuIterator(MenuObj);
		
		while (HeartHealthyMenuIterator.hasNext()) {  
		     tempMenu.addItem((MenuItem)HeartHealthyMenuIterator.next()); 
		 }
		
		return tempMenu;
	}
	
	/**
	 * Price menu.
	 *
	 * @return the menu
	 */
	public Menu PriceMenu(){
		Menu tempMenu= new Menu();
		MenuIteratorI PriceMenuIterator=new PriceMenuIterator(MenuObj);
		
		while (PriceMenuIterator.hasNext()) {  
		     tempMenu.addItem((MenuItem)PriceMenuIterator.next());
		}
		
		return tempMenu;
	}
	
	/**
	 * Price menu.
	 *
	 * @param input the input
	 * @return the menu
	 */
	public Menu PriceMenu(Double input){
		Menu tempMenu= new Menu();
		MenuIteratorI PriceMenuIterator=new PriceMenuIterator(MenuObj,input);
		
		while (PriceMenuIterator.hasNext()) {  
		     tempMenu.addItem((MenuItem)PriceMenuIterator.next());
		}
		
		return tempMenu;
	}

	/**
	 * Ingredient menu.
	 *
	 * @return the menu
	 */
	public Menu IngredientMenu(){
		Menu tempMenu= new Menu();
		MenuIteratorI IngredientMenuIterator=new IngredientMenuIterator(MenuObj);
		
		while (IngredientMenuIterator.hasNext()) {  
			tempMenu.addItem((MenuItem)IngredientMenuIterator.next()); 
		}
		
		return tempMenu;
	}

	
	/**
	 * Ingredient menu.
	 *
	 * @param input the input
	 * @return the menu
	 */
	public Menu IngredientMenu(String input){
		Menu tempMenu= new Menu();
		MenuIteratorI IngredientMenuIterator=new IngredientMenuIterator(MenuObj,input);
		
		while (IngredientMenuIterator.hasNext()) {  
			tempMenu.addItem((MenuItem)IngredientMenuIterator.next()); 
		}
		
		return tempMenu;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MenuObj == null) ? 0 : MenuObj.hashCode());
		result = prime * result + ((tableManagerObj == null) ? 0 : tableManagerObj.hashCode());
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
		InformationProvider other = (InformationProvider) obj;
		if (MenuObj == null) {
			if (other.MenuObj != null)
				return false;
		} else if (!MenuObj.equals(other.MenuObj))
			return false;
		if (tableManagerObj == null) {
			if (other.tableManagerObj != null)
				return false;
		} else if (!tableManagerObj.equals(other.tableManagerObj))
			return false;
		return true;
	}
	
	
	
	
}
