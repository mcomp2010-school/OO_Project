package org;

import org.commands.GetCMDCompleteMenuCommand;
import org.commands.GetCMDTables;
import org.info.menu.Menu;
import org.info.table.TableManager;

// TODO: Auto-generated Javadoc
/**
 * The Class SystemInterface.
 */
public class SystemInterface {

	/**
	 * Gets the gets the complete menu.
	 *
	 * @return the gets the complete menu
	 */
	public String getGetCompleteMenu(){		
		Menu Comp=(Menu) new GetCMDCompleteMenuCommand().execute();
		return Comp.toString().trim();
	}
	
	
	/**
	 * Gets the tables.
	 *
	 * @return the tables
	 */
	public String getTables(){
		TableManager TableMgr=(TableManager) new GetCMDTables().execute();
		return TableMgr.toString();
	}
}
