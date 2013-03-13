package org.info.menu;

import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.MenuIterator;
import org.info.menu.iterators.PriceMenuIterator;

/**
 * The Class Client.
 */
public class MenuDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Menu MenuObj= new Menu();
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
		
		
		//System.out.println(MenuObj);
		CompleteMenu(MenuObj);
		System.out.println("=====================");
		HeartHealthyMenu(MenuObj);
		System.out.println("=====================");
		PriceMenu(MenuObj);
		System.out.println("=====================");
		IngredientMenu(MenuObj);
	}
	
	/**
	 * Complete menu.
	 *
	 * @param input the input
	 */
	public static void CompleteMenu(Menu input){
		System.out.println("Complete Menu");
		System.out.println("----------------");
		MenuIterator CompleteMenuIterator=new CompleteMenuIterator(input);
		
		while (CompleteMenuIterator.hasNext()) {  
			CompleteMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(CompleteMenuIterator.next() + " ");  
		 } 
	}
	
	/**
	 * Heart healthy menu.
	 *
	 * @param Input the input
	 */
	public static void HeartHealthyMenu(Menu Input){
		System.out.println("Heart Healthy Menu");
		System.out.println("----------------");
		MenuIterator HeartHealthyMenuIterator=new HeartHealthyMenuIterator(Input);
		
		while (HeartHealthyMenuIterator.hasNext()) {  
			HeartHealthyMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(HeartHealthyMenuIterator.next() + " ");  
		 }
	}
	
	/**
	 * Price menu.
	 *
	 * @param Input the input
	 */
	public static void PriceMenu(Menu Input){
		System.out.println("Price Menu");
		System.out.println("----------------");
		MenuIterator PriceMenuIterator=new PriceMenuIterator(Input);
		
		while (PriceMenuIterator.hasNext()) {  
			 PriceMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(PriceMenuIterator.next() + " ");  
		 }
	}

	/**
	 * Ingredient menu.
	 *
	 * @param Input the input
	 */
	public static void IngredientMenu(Menu Input){
		System.out.println("Ingredient Menu");
		System.out.println("----------------");
		MenuIterator IngredientMenuIterator=new IngredientMenuIterator(Input);
		
		while (IngredientMenuIterator.hasNext()) {  
			IngredientMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(IngredientMenuIterator.next() + " ");  
		 }
	}
	
}
