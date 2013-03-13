package org.info.menu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.info.menu.iterators.MenuIterator;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class Menu.
 */
public class Menu {
	
	/** The Menu list. */
	private ArrayList<MenuItem> MenuList= new ArrayList<MenuItem>();
	
	/**
	 * Adds the item.
	 *
	 * @param itemName the item name
	 * @param price the price
	 * @param mainIngredient the main ingredient
	 */
	public void addItem(String itemName, Double price, String mainIngredient){
		MenuList.add(new MenuItem(itemName, price, mainIngredient));
	}
	
	
	/**
	 * Adds the item.
	 *
	 * @param itemName the item name
	 * @param price the price
	 * @param mainIngredient the main ingredient
	 * @param isHeartHealthy the is heart healthy
	 */
	public void addItem(String itemName, Double price, String mainIngredient,boolean isHeartHealthy){
		MenuList.add(new MenuItem(itemName, price, mainIngredient,isHeartHealthy));
	}
	
	
	/**
	 * Adds the item.
	 *
	 * @param next the next
	 */
	public void addItem(MenuItem next) {
		MenuList.add(next);
	}
	
	
	/**
	 * Contains.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	public boolean contains(Object o) {
		return MenuList.contains(o);
	}


	/**
	 * Gets the.
	 *
	 * @param index the index
	 * @return the menu item
	 */
	public MenuItem get(int index) {
		return MenuList.get(index);
	}


	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return MenuList.isEmpty();
	}


	/**
	 * Removes the index.
	 *
	 * @param index the index
	 * @return the menu item
	 */
	public MenuItem remove(int index) {
		return MenuList.remove(index);
	}


	/**
	 * Removes the object of Type MenuItem.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	public boolean remove(Object o) {
		return MenuList.remove(o);
	}


	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return MenuList.size();
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder Output= new StringBuilder();

		for (int i = 0; i < this.MenuList.size(); i++) {
			Output.append(this.MenuList.get(i)+"\n");
		}
		
		return Output.toString();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((MenuList == null) ? 0 : MenuList.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (MenuList == null) {
			if (other.MenuList != null)
				return false;
		} else if (!MenuList.equals(other.MenuList))
			return false;
		return true;
	}

	public void loadXML(String FileName){
		XStream xstream = new XStream();
		xstream.alias("MenuItem", MenuItem.class);
		
		this.MenuList.clear();
		
		File file = new File(FileName);
		List<String> lines = null;
		try {
			lines = FileUtils.readLines(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuilder tempbuffer=new StringBuilder();
		
		boolean onRecord=false;
		
		for (int i = 0; i < lines.size(); i++) {
			String currentlineString=lines.get(i);
			
			if(currentlineString.contains("<MenuItem>")){
				onRecord=true;
			}
			
			if(onRecord==true){
				tempbuffer.append(currentlineString);
			}
			
			if(currentlineString.contains("</MenuItem>")){
				onRecord=false;
				//System.out.println(tempbuffer.toString());
				
			
				MenuItem tempMenuItem=(MenuItem)xstream.fromXML(tempbuffer.toString());
				
				//System.out.println(tempMenuItem);
				MenuList.add( tempMenuItem);
				tempbuffer.setLength(0);
			}
		} 
	}
	
	public String getXML(){
		StringBuilder Output=new StringBuilder();
		Output.append("<?xml version=\"1.0\"?>\n");
		Output.append("<root>\n");
		
		XStream xstream = new XStream(); 
		xstream.alias("MenuItem", MenuItem.class);
		
		for (int i = 0; i < MenuList.size(); i++) {
			String xml = xstream.toXML(this.MenuList.get(i));
			//System.out.println(xml);
			Output.append(xml+"\n");
		}
		
		Output.append("</root>");
		
		return Output.toString();
	}
	
	public void saveXML(String FileName){
		File file = new File(FileName);
		try {
			FileUtils.writeStringToFile(file, this.getXML());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
