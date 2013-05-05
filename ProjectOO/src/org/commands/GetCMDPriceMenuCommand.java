package org.commands;

import org.command.Command;
import org.info.InformationProvider;

/**
 * The Class GetCMDPriceMenuCommand.
 * */
public class GetCMDPriceMenuCommand implements Command{
	
	/**The info obj.*/
	InformationProvider infoObj = InformationProvider.getSingletonObject();
	
	/**Max price for menu items returned*/
	private double price;
	 
	public GetCMDPriceMenuCommand(double price){
		this.price = price;
	}	
	
	@Override
	public Object execute(){		
		return infoObj.PriceMenu(this.price);
	}
}
