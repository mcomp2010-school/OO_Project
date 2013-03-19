package org.info.offer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.shared.XStreamXML;

import com.thoughtworks.xstream.XStream;

/**
 * The Class Offer.
 */
public class Offer implements XStreamXML{

	@Override
	public void loadXML(String FileName) {
		// TODO need to implement- Can copy paste code from Menu
		
	}

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
