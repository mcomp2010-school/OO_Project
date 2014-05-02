package org.info.tab;

public class TabDemo {

	public static void main (String [] args) {

		Tab myTab;

		ListOfItemsGenerator theList = new ListOfItemsGenerator();
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
		double cost = myTab.getMyList().getCost();
		String list = myTab.getMyList().getList();

		myTab.printTab(cost, list);
		System.out.println(myTab);
		// myTab.print();
	}

}

