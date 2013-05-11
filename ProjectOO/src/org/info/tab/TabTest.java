package org.info.tab;

public class TabTest {
	
	public static void main (String [] args) {
		
		Tab myTab;
		
		ListOfItems theList = new ListOfItems();
		theList.getMenuItems();
		
		if (theList.getOrderSize() >= 3){
			if (theList.getCost() >= 20.00){
				myTab = new CouponTab();
			} else 
				myTab = new SurveyTab();
		} else {
			myTab = new BlankTab();	
		}
		myTab.setList(theList);
		double cost = myTab.myList.getCost();
		String list = myTab.myList.getList();
		
		myTab.printTab(cost, list);
		// myTab.print();
	}

}

