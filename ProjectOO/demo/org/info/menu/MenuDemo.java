package org.info.menu;

import org.info.menu.iterators.CompleteMenuIterator;
import org.info.menu.iterators.HeartHealthyMenuIterator;
import org.info.menu.iterators.IngredientMenuIterator;
import org.info.menu.iterators.PriceMenuIterator;
import org.interfaces.MenuIteratorI;
import org.shared.Utils;


// TODO: Auto-generated Javadoc
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
		
		boolean useFile=true;
		
		if(useFile){
			MenuObj.loadXML("data\\Menu.xml");
		}else{
			MenuObj.addItem("Spaghetti with Meat Sauce", 4.99, "Beef",true, "Entree");
			MenuObj.addItem("Spaghetti with Red Sauce", 4.50, "Pasta",true, "Entree");
			MenuObj.addItem("Chicken and Rice", 3.59, "Chicken",false, "Entree");
			MenuObj.addItem("Chicken Tenders with Fries", 3.49, "Chicken",true,"Entree");
			MenuObj.addItem("Grilled Chicken Sandwitch with Fries", 3.99, "Chicken",false,"Entree");
			MenuObj.addItem("1/2 Pound Humburger with Fries", 5.99, "Beef",true,"Entree");
			MenuObj.addItem("Chicken Tenders with Chips", 3.39, "Chicken",true,"Entree");
			MenuObj.addItem("Chipotle Lime Chicken", 6.99, "Chicken",true,"Entree");
			MenuObj.addItem("Chocolate Chip Cookie Sundae", 3.20, "Ice Cream",false, "Dessert");
			MenuObj.addItem("Maple Butter Blondie", 3.99, "Ice Cream",false, "Dessert");
			
			MenuObj.saveXML("data\\Menu.xml");
		}
	

		//System.out.println(MenuObj);
		CompleteMenu(MenuObj);
		System.out.println("=====================");
		HeartHealthyMenu(MenuObj);
		System.out.println("=====================");
		PriceMenu(MenuObj);
		System.out.println("=====================");
		IngredientMenu(MenuObj);
		
		//System.out.println(MenuObj.getXML());
		System.out.println("=====================");
		System.out.println(MenuObj.getItemByID(5));
		System.out.println(MenuObj.getItemByIDs("1,5,6,7"));
		
		
		
	}
	
	
	
	/**
	 * Complete menu.
	 *
	 * @param input the input
	 */
	public static void CompleteMenu(Menu input){
		System.out.println("Complete Menu");
		System.out.println("----------------");
		MenuIteratorI CompleteMenuIterator=new CompleteMenuIterator(input);
		
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
		MenuIteratorI HeartHealthyMenuIterator=new HeartHealthyMenuIterator(Input);
		
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
		MenuIteratorI PriceMenuIterator=new PriceMenuIterator(Input);
		
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
		MenuIteratorI IngredientMenuIterator=new IngredientMenuIterator(Input);
		
		while (IngredientMenuIterator.hasNext()) {  
			IngredientMenuIterator.hasNext(); // extra call should have no effect  
		     System.out.println(IngredientMenuIterator.next() + " ");  
		 }
	}
	
}
