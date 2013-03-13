package org.info.menu;

import java.util.ArrayList;
import java.util.Iterator;

import org.info.menu.iterators.MenuIterator;

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

}
