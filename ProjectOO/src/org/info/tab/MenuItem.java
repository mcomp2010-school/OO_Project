package org.info.tab;

public class MenuItem {
	
	private String name;
	private double price;
	private boolean heartHealthy;
	private String mainIngredient;
	
	public MenuItem(String theName, double thePrice, boolean isHeartHealthy, String main) {
		this.name = theName;
		this.price = thePrice;
		this.heartHealthy = isHeartHealthy;
		this.mainIngredient = main;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getHeartHealthy() {
		return this.heartHealthy;
	}
	
	public String getMain() {
		return this.mainIngredient;
	}
	
}
