package org.errors.table;

// TODO: Auto-generated Javadoc
/**
 * The Class NoMoreRoomException.
 */
public class NoMoreRoomException extends Exception {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2633860579719715210L;
	
	/** The Desc. */
	private String Desc;

	
	/**
	 * Instantiates a new no more room exception.
	 *
	 * @param desc the desc
	 */
	public NoMoreRoomException(String desc) {
		super();
		Desc = desc;
	}



	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return "" + Desc + "";
	}
	
	
	
}
