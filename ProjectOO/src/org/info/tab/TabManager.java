package org.info.tab;

import java.util.ArrayList;

public class TabManager {
	private ArrayList<Tab> myTabs= new ArrayList<Tab>();
	
	public void addTab(Tab newTab){
		myTabs.add(newTab);
	}
	
	public int size() {
		return myTabs.size();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
