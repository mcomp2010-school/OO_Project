package org.info.tab;

import java.util.Random;

import org.info.InformationProvider;
import org.info.menu.Menu;
import org.info.menu.MenuItem;

public class ItemsGenerator {

	public MenuItem getMenuItem() {
		InformationProvider infoObj=InformationProvider.getSingletonObject();
		
		Menu myMenu = infoObj.getMenuObj();
		Random random = new Random();
		int index = random.nextInt(9);
		MenuItem theItem = myMenu.get(index);
		return theItem;
		
	}
}
