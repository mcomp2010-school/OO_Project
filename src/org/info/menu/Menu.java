package org.info.menu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.interfaces.XStreamXMLI;
import org.shared.Utils;
import org.shared.performance.Timing;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;


// TODO: Auto-generated Javadoc
/**
 * The Class Menu.
 */
public class Menu implements XStreamXMLI {
	
	/** The Stop watch performance. */
	private static boolean StopWatchPerformance=false;
	
	/** The Clock1. */
	private static Timing Clock1=new Timing();
	
	/** The Menu list. */
	@XStreamAlias("MenuList")
	private ArrayList<MenuItem> MenuList= new ArrayList<MenuItem>();
	
	/** The Item id. */
	private Integer ItemID=0;
	
	/**
	 * Adds the item.
	 *
	 * @param itemName the item name
	 * @param price the price
	 * @param mainIngredient the main ingredient
	 * @param category the category
	 */
	public void addItem(String itemName, Double price, String mainIngredient, String category){
		MenuList.add(new MenuItem(ItemID,itemName, price, mainIngredient,category));
		ItemID++;
	}
	
	/**
	 * Adds the item.
	 *
	 * @param itemName the item name
	 * @param price the price
	 * @param mainIngredient the main ingredient
	 * @param isHeartHealthy the is heart healthy
	 * @param category the category
	 */
	public void addItem(String itemName, Double price, String mainIngredient,boolean isHeartHealthy,
			String category){
		MenuList.add(new MenuItem(ItemID,itemName, price, mainIngredient,isHeartHealthy,category));
		ItemID++;
	}
	
	
	/**
	 * Adds the item.
	 *
	 * @param next the next
	 */
	public void addItem(MenuItem next) {
		MenuList.add(next);
		ItemID++;
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
	 * Gets the item by i ds.
	 *
	 * @param inputString the input string
	 * @return the item by i ds
	 */
	public ArrayList<MenuItem> getItemByIDs(String inputString){
		ArrayList<MenuItem> tempList= new ArrayList<MenuItem>();
		
		Integer[] splits = Utils.convertStringArrayToIntegerArray(inputString.split(","));
		
		
		for (int i = 0; i < MenuList.size(); i++) {
			MenuItem current= MenuList.get(i);
			
			for (int j = 0; j < splits.length; j++) {
				Integer currentID=splits[j];
				
				if(current.getItemID().equals(currentID)){
					tempList.add(current);
					break;
				}	
			}
		}
		
		return tempList;
	}
	
	
	/**
	 * Gets the itemby id.
	 *
	 * @param inputID the input id
	 * @return the itemby id
	 */
	public MenuItem getItemByID(Integer inputID){
		MenuItem item=null;
		
			
		for (int i = 0; i < MenuList.size(); i++) {
			MenuItem current= MenuList.get(i);
			if(current.getItemID().equals(inputID)){
				item=current;
				break;
			}	
		}
		
		return item;
	}
	
	/**
	 * Gets the unique ingredients.
	 *
	 * @return the unique ingredients
	 */
	public String[] getUniqueIngredients(){
		TreeSet<String> temp= new TreeSet<String>();
		
		for (int i = 0; i < MenuList.size(); i++) {
			MenuItem current= MenuList.get(i);
			temp.add(current.getMainIngredient());
		}
		
		return temp.toArray(new String[temp.size()]);
	}
	
	/**
	 * Gets the MenuItem with the ArrayList Index
	 * Used for the Iterators.
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

	/**
	 * Load xml.
	 *
	 * @param FileName the file name
	 */
	@Override
	public void loadXML(String FileName){
		Clock1.start();
		XStream xstream = new XStream();
		xstream.alias("MenuItem", MenuItem.class);
		xstream.autodetectAnnotations(true);
		
		if(StopWatchPerformance)System.err.println(this.getClass().getName()+".loadXML() > xStream :"+Clock1.stop_SecDouble());
		
		
		this.MenuList.clear();
		
		Clock1.start();
		File file = new File(FileName);
		String lines = null;
		try {
			lines = FileUtils.readFileToString(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(StopWatchPerformance)System.err.println(this.getClass().getName()+".loadXML() > loading file :"+Clock1.stop_SecDouble());
		
		Clock1.start();
		ArrayList<MenuItem> tempTable=(ArrayList<MenuItem>)xstream.fromXML(lines.toString());
		if(StopWatchPerformance)System.err.println(this.getClass().getName()+".loadXML() > xml serialization :"+Clock1.stop_SecDouble());
		
		this.MenuList=tempTable;
	}
	
	/**
	 * Gets the xml.
	 *
	 * @return the xml
	 */
	@Override
	public String getXML(){		
		XStream xstream = new XStream(); 
		xstream.alias("MenuItem", MenuItem.class);
		
		xstream.autodetectAnnotations(true);
		
		String xml = xstream.toXML(this.MenuList);
		
		return xml;
	}
	
	/**
	 * Save xml.
	 *
	 * @param FileName the file name
	 */
	@Override
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
