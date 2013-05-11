package org.info.tab;

public class BlankTab extends Tab {
	
	public void printTab(double cost, String theList){
		super.printTab(cost, theList);
		System.out.println();
		System.out.println("Thank you for choosing us!");
	}
	
}