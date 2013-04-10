package org.commands;

import org.command.Command;
import org.info.InformationProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class GetCompleteMenuCommand.
 */
public class GetCMDCompleteMenuCommand implements Command{
	
	/** The info obj. */
	InformationProvider infoObj=InformationProvider.getSingletonObject();
	
	/* (non-Javadoc)
	 * @see org.command.Command#execute()
	 */
	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return infoObj.CompleteMenu();
	}

	
}
