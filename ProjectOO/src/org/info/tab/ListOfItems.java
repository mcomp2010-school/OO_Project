package org.info.tab;

public class ListOfItems {

	int min = 1;
	int max = 5;
	int myRandom = min + (int)(Math.random() * (max - min) + 1);
	protected int orderSize = myRandom;
	private double totalCost;
	private String list;
	
	ItemsGenerator generator = new ItemsGenerator();
	
	public void getMenuItems() {
		list = "";
		for (int i = 0; i < orderSize; i++){
			MenuItem myItem = generator.getMenuItem();
			setCost(myItem.getPrice());
			list += myItem.getName() + " " + myItem.getPrice();
			list += "\n";
		}
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


