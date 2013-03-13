package org.info;

import org.info.menu.Menu;

public class InformationProviderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InformationProvider infoObj=InformationProvider.getSingletonObject();
		
		//Get CompleteMenu
		Menu CompleteMenu= infoObj.CompleteMenu();
		System.out.println(CompleteMenu);
		
		
	}

}
