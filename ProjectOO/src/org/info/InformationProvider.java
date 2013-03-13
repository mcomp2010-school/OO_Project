package org.info;

import org.info.menu.Menu;
import org.info.menu.MenuItem;
import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.MenuIterator;
import org.info.menu.iterators.PriceMenuIterator;

public class InformationProvider {

	/**
	 * Complete menu.
	 *
	 * @param input the input
	 */
	public static Menu CompleteMenu(Menu input){
		Menu tempMenu= new Menu();
		MenuIterator CompleteMenuIterator=new CompleteMenuIterator(input);
		
		while (CompleteMenuIterator.hasNext()) {  
			CompleteMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(CompleteMenuIterator.next() + " ");  
		 } 
		return tempMenu;
	}
	
	/**
	 * Heart healthy menu.
	 *
	 * @param Input the input
	 */
	public static Menu HeartHealthyMenu(Menu Input){
		Menu tempMenu= new Menu();
		MenuIterator HeartHealthyMenuIterator=new HeartHealthyMenuIterator(Input);
		
		while (HeartHealthyMenuIterator.hasNext()) {  
		     tempMenu.addItem((MenuItem)HeartHealthyMenuIterator.next()); 
		 }
		
		return tempMenu;
	}
	
	/**
	 * Price menu.
	 *
	 * @param Input the input
	 */
	public static Menu PriceMenu(Menu Input){
		Menu tempMenu= new Menu();
		MenuIterator PriceMenuIterator=new PriceMenuIterator(Input);
		
		while (PriceMenuIterator.hasNext()) {  
		     tempMenu.addItem((MenuItem)PriceMenuIterator.next());
		}
		
		return tempMenu;
	}

	/**
	 * Ingredient menu.
	 *
	 * @param Input the input
	 */
	public static Menu IngredientMenu(Menu Input){
		Menu tempMenu= new Menu();
		MenuIterator IngredientMenuIterator=new IngredientMenuIterator(Input);
		
		while (IngredientMenuIterator.hasNext()) {  
			tempMenu.addItem((MenuItem)IngredientMenuIterator.next()); 
		}
		
		return tempMenu;
	}
	
	
}
