package org.info;

import org.info.menu.Menu;
import org.info.menu.MenuItem;
import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.MenuIterator;
import org.info.menu.iterators.PriceMenuIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class InformationProvider.
 */
public class InformationProvider {
	
	/** The Menu obj. */
	private static Menu MenuObj= new Menu();
	
	/** The singleton object. */
	private static InformationProvider singletonObject;
	
	/**
	 * Instantiates a new information provider.
	 */
	private InformationProvider() {
		//Persistent Data
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
	
	
}
