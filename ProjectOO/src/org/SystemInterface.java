package org;

import org.commands.GetCMDCompleteMenuCommand;
import org.commands.GetCMDTables;
import org.info.menu.Menu;
import org.info.table.TableManager;

public class SystemInterface {

	public String getGetCompleteMenu(){		
		
		Menu Comp=(Menu) new GetCMDCompleteMenuCommand().execute();
		
		return Comp.toString().trim();
	}
	
	
	public String getTables(){
		TableManager TableMgr=(TableManager) new GetCMDTables().execute();
		return TableMgr.toString();
	}
}
