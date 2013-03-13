package org.info;

import org.info.menu.Menu;
import org.info.menu.MenuItem;
import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.MenuIterator;
import org.info.menu.iterators.PriceMenuIterator;
import org.info.table.TableManager;

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
	
	/**
	 * Instantiates a new information provider.
	 */
	private InformationProvider() {
		//Persistent Data
		
		//Adding MenuItems
		MenuObj.addItem("Spagatti with Meat Sauce", 4.99, "Beef",true);
		MenuObj.addItem("Spagatti with Red Sauce", 4.50, "Pasta",true);
		MenuObj.addItem("Chicken and Rice", 3.59, "Chicken",false);
		MenuObj.addItem("Chicken Tenders with Fries", 3.49, "Chicken",true);
		MenuObj.addItem("Grilled Chicken Sandwitch with Fries", 3.99, "Chicken",false);
		MenuObj.addItem("1/2 Pound Humburger with Fries", 5.99, "Beef",true);
		MenuObj.addItem("Chicken Tenders with Chips", 3.39, "Chicken",true);
		MenuObj.addItem("Chipotle Lime Chicken", 6.99, "Chicken",true);
		MenuObj.addItem("Chocolate Chip Cookie Sundae", 3.20, "Ice Cream",false);
		MenuObj.addItem("Maple Butter Blondie", 3.99, "Ice Cream",false);
		
		//Adding Tables
		Tables.add(1, 4);
		Tables.add(2, 4);
		Tables.add(3, 5);
		Tables.add(4, 6);
		Tables.add(5, 6);
		Tables.add(6, 2);
		Tables.add(7, 2);
		
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
