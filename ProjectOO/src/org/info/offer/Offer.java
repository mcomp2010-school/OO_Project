package org.info.offer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.shared.XStreamXML;

import com.thoughtworks.xstream.XStream;

// TODO: Auto-generated Javadoc
/**
 * The Class Offer.
 */
public class Offer implements XStreamXML{

	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#loadXML(java.lang.String)
	 */
	@Override
	public void loadXML(String FileName) {
		// TODO need to implement- Can copy paste code from Menu
		
	}

	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#getXML()
	 */
	@Override
	public String getXML() {
		XStream xstream = new XStream(); 
		// TODO need to change line below for new class
		//xstream.alias("MenuItem", MenuItem.class);
		
		xstream.autodetectAnnotations(true);
		
		// TODO need to change line below for new class
		String xml = "NEED TO CHANGE"; //xstream.toXML(this.MenuList);
		
		return xml;
	}

	/* (non-Javadoc)
	 * @see org.shared.XStreamXML#saveXML(java.lang.String)
	 */
	@Override
	public void saveXML(String FileName) {
		File file = new File(FileName);
		try {
			FileUtils.writeStringToFile(file, this.getXML());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
