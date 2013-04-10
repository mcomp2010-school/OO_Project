package org;

import org.commands.GetCompleteMenuCommand;
import org.info.menu.Menu;

public class SystemInterface {

	public String getGetCompleteMenu(){		
		
		Menu Comp=(Menu) new GetCompleteMenuCommand().execute();
		
		return Comp.toString().trim();
	}
}
