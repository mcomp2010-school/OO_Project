package org.info.tab;

public class CouponTab extends BlankTab {

	@Override
	public void printTab(double cost, String theList){
		super.printTab(cost, theList);
		getCoupons();
	}

	public void getCoupons() {
		System.out.println();
		System.out.println("You are qualified for a special offer!");
		System.out.println("Bring this receipt with you on your next visit");
		System.out.println("And enjoy 10% off of your next order!");
	}
}
