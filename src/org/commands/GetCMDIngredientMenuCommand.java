package org.commands;

import org.command.Command;
import org.info.InformationProvider;

/**
 * The Class getCMDIngredientMenuCommand.
 * */
public class GetCMDIngredientMenuCommand implements Command{
	/**The info obj.*/
	InformationProvider infoObj = InformationProvider.getSingletonObject();
	
	/**The ingredient for menu items returned*/
	private String ingredient;
	
	public GetCMDIngredientMenuCommand(String ingredient){
		this.ingredient = ingredient;
	}
	
	@Override
	public Object execute(){
		return infoObj.IngredientMenu(this.ingredient);
	}	
}
