package org.info;

import org.info.menu.Menu;
import org.info.menu.MenuItem;
import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.MenuIterator;
import org.info.menu.iterators.PriceMenuIterator;
import org.info.table.TableManager;
import org.shared.performance.Timing;

// TODO: Auto-generated Javadoc
/**
 * The Class InformationProvider.
 */
public class InformationProvider {
	
	/** The Menu obj. */
	private Menu MenuObj= new Menu();
	
	/** The Tables. */
	private TableManager Tables=new TableManager();
	
	/** The singleton object. */
	private static InformationProvider singletonObject;
	
	/** The Clock1. */
	Timing Clock1=new Timing();
	
	/**
	 * Instantiates a new information provider.
	 */
	private InformationProvider() {
		
		Clock1.start();
		
		//Loading Persistent Data
		
		//Adding MenuItems
		MenuObj.loadXML("data\\Menu.xml");
		
		//Adding Tables
		Tables.loadXML("data\\Table.xml");
		
		System.out.println(this.getClass().getName()+".InformationProvider():"+Clock1.stop_SecDouble());
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
	
	/**
	 * Complete menu.
	 *
	 * @return the menu
	 */
	public Menu CompleteMenu(){
		Menu tempMenu= new Menu();
		MenuIterator CompleteMenuIterator=new CompleteMenuIterator(MenuObj);
		
		while (CompleteMenuIterator.hasNext()) {  
			CompleteMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(CompleteMenuIterator.next() + " ");  
		 } 
		return tempMenu;
	}
	
	/**
	 * Heart healthy menu.
	 *
	 * @return the menu
	 */
	public Menu HeartHealthyMenu(){
		Menu tempMenu= new Menu();
		MenuIterator HeartHealthyMenuIterator=new HeartHealthyMenuIterator(MenuObj);
		
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
		MenuIterator PriceMenuIterator=new PriceMenuIterator(MenuObj);
		
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
		MenuIterator IngredientMenuIterator=new IngredientMenuIterator(MenuObj);
		
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
		result = prime * result + ((Tables == null) ? 0 : Tables.hashCode());
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
		if (Tables == null) {
			if (other.Tables != null)
				return false;
		} else if (!Tables.equals(other.Tables))
			return false;
		return true;
	}
	
	
	
	
}
