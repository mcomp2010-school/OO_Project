package org.info.tab;

import java.util.ArrayList;

import org.info.menu.MenuItem;

public class ListOfItemsGenerator {

	int min = 1;
	int max = 10;
	int myRandom = min + (int)(Math.random() * (max - min) + 1);
	protected int orderSize = myRandom;
	private double totalCost;
	private String list;
	
	ItemsGenerator generator = new ItemsGenerator();
	
	public ArrayList<MenuItem> getMenuItems() {
		ArrayList<MenuItem> items= new ArrayList<MenuItem>();
		
		list = "";
		for (int i = 0; i < orderSize; i++){
			MenuItem myItem = generator.getMenuItem();
			setCost(myItem.getPrice());
			list += myItem.getItemName() + " " + myItem.getPrice();
			list += "\n";
			items.add(myItem);
		}
		return items;
	}
	
	
	public double getCost() {
		return totalCost;
	}
	
	public void setCost(double theCost) {
		totalCost += (theCost + theCost*.05);
	}
	
	public String getList() {
		return list;
	}
	
	public int getOrderSize() {
		if (orderSize == 0){
			orderSize = 1;
			return orderSize;
		}
		return orderSize;
	}
}


