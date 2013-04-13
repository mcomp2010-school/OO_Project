package org.errors.table;

public class NoMoreRoomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2633860579719715210L;
	private String Desc;

	
	public NoMoreRoomException(String desc) {
		super();
		Desc = desc;
	}



	@Override
	public String toString() {
		return "" + Desc + "";
	}
	
	
	
}
