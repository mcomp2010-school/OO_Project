package org.system;

import java.util.ArrayList;

import org.command.Invoker;
import org.commands.GetCMDAllSampleOrdersCommand;
import org.commands.GetCMDCompleteMenuCommand;
import org.commands.GetCMDHeartHealthyMenuCommand;
import org.commands.GetCMDIngredientMenuCommand;
import org.commands.GetCMDPriceMenuCommand;
import org.commands.GetCMDTables;
import org.info.menu.Menu;
import org.info.order.Order;
import org.info.table.TableManager;

// TODO: Auto-generated Javadoc
/**
 * The Class SystemInterface.
 */
public class SystemInterface {

	/** Invoker Obj */
	private Invoker invoker;
	
	public SystemInterface(){
		 invoker = new Invoker();
	}
	
	/**
	 * Gets the gets the complete menu.
	 *
	 * @return the gets the complete menu
	 */
	public String getGetCompleteMenu(){		
		Menu cMenu = (Menu)invoker.executeCommand(new GetCMDCompleteMenuCommand());
		return cMenu.toString().trim();
	}
	
	/**
	 * Gets the heart healthy menu
	 * */
	public String getHeartHealthyMenu(){
		Menu hMenu = (Menu)invoker.executeCommand(new GetCMDHeartHealthyMenuCommand());
		return hMenu.toString().trim();
	}
	
	/**
	 * Gets the Price menu
	 * */
	public String getPriceMenu(double maxPrice){
		Menu pMenu = (Menu)invoker.executeCommand(new GetCMDPriceMenuCommand(maxPrice));
		return pMenu.toString().trim();
	}
	
	/**
	 * Gets the ingredient menu
	 * */
	public String getIngredientMenu(String ingredient){
		Menu iMenu = (Menu)invoker.executeCommand(new GetCMDIngredientMenuCommand(ingredient));
		return iMenu.toString().trim();
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
	
	/**
	 * Gets Sample Orders in the system*/
	public String getSampleOrders(){
		ArrayList<Order> orders = (ArrayList<Order>)invoker.executeCommand(new GetCMDAllSampleOrdersCommand());
		return orders.toString();
	}
		
}
