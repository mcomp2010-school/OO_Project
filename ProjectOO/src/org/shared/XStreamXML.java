package org.shared;

/**
 * The Interface XStreamXML.
 */
public interface XStreamXML {
	
	/**
	 * Load xml.
	 *
	 * @param FileName the file name
	 */
	public void loadXML(String FileName);
	
	/**
	 * Gets the xml.
	 *
	 * @return the xml
	 */
	public String getXML();
	
	/**
	 * Save xml.
	 *
	 * @param FileName the file name
	 */
	public void saveXML(String FileName);
}
