package org.command;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Invoker.
 */
public class Invoker {

	//This ArrayList gives up the option to queue up commands and defer execution
	private ArrayList<Command> commandQueue;
	
	public Invoker()
	{
		commandQueue = new ArrayList<Command>();
	}
	
	public Object executeCommand(Command command)
	{
		Object result;
		commandQueue.add(command);
		//TODO: should we implement command queueing?
		
		result = commandQueue.get(0).execute();
		commandQueue.remove(0);
		return result;
	}
}
