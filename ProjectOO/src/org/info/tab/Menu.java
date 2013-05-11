package org.info.tab;

import java.util.ArrayList;

public class Menu {
	
	public ArrayList <MenuItem> menuItems = new ArrayList <MenuItem> ();
	
	MenuItem itemOne = new MenuItem("Spaghetti and Meatballs", 4.99, false, "pasta");
	MenuItem itemTwo = new MenuItem("Beef Bourguignon", 7.50, false, "beef");
	MenuItem itemThree = new MenuItem("Caesar Salad", 6.45, true, "vegetables");
	MenuItem itemFour = new MenuItem("Cheeseburger and Fries", 8.99, false, "beef");
	MenuItem itemFive = new MenuItem("New England Clam Chowder", 3.99, false, "fish");
	MenuItem itemSix = new MenuItem("Meatloaf and Mashed Potatoes", 7.89, false, "beef");
	MenuItem itemSeven = new MenuItem("Grilled Cheese", 2.99, false, "cheese");
	MenuItem itemEight = new MenuItem("Vegetable Dumplings", 4.45, true, "vegetables");
	MenuItem itemNine = new MenuItem("Minestrone", 3.75, true, "vegetables");
	MenuItem itemTen = new MenuItem("Poutine", 3.78, false, "cheese");
	
	public Menu() {
		menuItems.add(itemOne);
		menuItems.add(itemTwo);
		menuItems.add(itemThree);
		menuItems.add(itemFour);
		menuItems.add(itemFive);
		menuItems.add(itemSix);
		menuItems.add(itemSeven);
		menuItems.add(itemEight);
		menuItems.add(itemNine);
		menuItems.add(itemTen);
	}
	
}

