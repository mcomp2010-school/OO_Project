package org.info.tab;

import java.util.ArrayList;

public class TabManager {
	private ArrayList<String> myTabs= new ArrayList<String>();
	
	public void addTab(String newTab){
		myTabs.add(newTab);
	}
	
	public int size() {
		return myTabs.size();
	}
	
	public String getMyTabs(int index) {
		return myTabs.get(index);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
