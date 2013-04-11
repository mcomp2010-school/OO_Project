package org.commands;

import org.command.Command;
import org.info.InformationProvider;
import org.info.table.TableManager;

// TODO: Auto-generated Javadoc
/**
 * The Class GetCMDTables.
 */
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
