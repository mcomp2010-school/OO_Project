package org.info.tab;

import java.util.Random;

public class ItemsGenerator {

	public MenuItem getMenuItem() {
		
		Menu myMenu = new Menu();
		Random random = new Random();
		int index = random.nextInt(9);
		MenuItem theItem = myMenu.menuItems.get(index);
		return theItem;
		
	}
}
