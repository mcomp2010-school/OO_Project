package org.commands;

import org.command.Command;
import org.info.InformationProvider;
import org.info.table.TableManager;

public class GetCMDTables implements Command{

	/** The info obj. */
	InformationProvider infoObj=InformationProvider.getSingletonObject();
	
	/* (non-Javadoc)
	 * @see org.command.Command#execute()
	 */
	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return (TableManager)infoObj.Tables();
	}

}
