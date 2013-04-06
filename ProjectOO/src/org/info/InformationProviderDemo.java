package org.info;

import org.info.menu.Menu;

// TODO: Auto-generated Javadoc
/**
 * The Class InformationProviderDemo.
 */
public class InformationProviderDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		InformationProvider infoObj=InformationProvider.getSingletonObject();
		
		//Get CompleteMenu
		Menu CompleteMenu= infoObj.CompleteMenu();
		System.out.println(CompleteMenu);
	}

}
