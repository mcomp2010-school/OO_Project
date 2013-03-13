package org.info.menu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import org.apache.commons.io.FileUtils;
import org.info.menu.iterators.MenuIterator;
import org.info.table.Table;
import org.shared.performance.Timing;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class Menu.
 */
public class Menu {
	
	private boolean StopWatchPerformance=true;
	private Timing Clock1=new Timing();
	
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

	/**
	 * Load xml.
	 *
	 * @param FileName the file name
	 */
	public void loadXML(String FileName){
		Clock1.start();
		XStream xstream = new XStream();
		xstream.alias("MenuItem", MenuItem.class);  
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
	public String getXML(){
		StringBuilder Output=new StringBuilder();
		
		XStream xstream = new XStream(); 
		xstream.alias("MenuItem", MenuItem.class);
		String xml = xstream.toXML(this.MenuList);
		Output.append(xml);
		
		return Output.toString();
	}
	
	
	public String getXML_JAXB(){
		try {
		JAXBContext context = JAXBContext.newInstance(MenuItem.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    // Write to System.out
	  
			m.marshal(this.MenuList, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return "";
	}
	/**
	 * Save xml.
	 *
	 * @param FileName the file name
	 */
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
