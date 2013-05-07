package org.commands;

import java.util.ArrayList;

import org.command.Command;
import org.info.InformationProvider;
import org.info.order.Order;

public class GetCMDAllSampleOrdersCommand implements Command{
	/**The info obj*/
	InformationProvider infoObj = InformationProvider.getSingletonObject();
	
	@Override
	public Object execute(){
		return (ArrayList<Order>)infoObj.GetAllSampleOrders();
	}
}
