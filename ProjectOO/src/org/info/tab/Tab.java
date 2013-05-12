package org.info.tab;

/**
 * The Class Tab.
 */
public abstract class Tab {
	
	private ListOfItems myList;
	
	
	public ListOfItems getMyList() {
		return myList;
	}

	public void printTab(double total, String theList) {
		System.out.println("You have ordered: ");
		System.out.println(theList);
		System.out.println("Your total is: ");
		System.out.println(total);
	}
	
	public void setList(ListOfItems theList){
		myList = theList;
	}
	
}
