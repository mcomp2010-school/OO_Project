package org.shared.time;

import java.sql.Timestamp;

import org.joda.time.DateTime;

// TODO: Auto-generated Javadoc
/**
 * The Class JodaDemo.
 */
public class JodaDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DateTime dateTime = new DateTime();
		Timestamp timeStamp = new Timestamp(dateTime.getMillis());
		System.out.println(timeStamp);
		
		DateTime dateTimeA= new DateTime(timeStamp);
		
		System.out.println(dateTimeA);
	}

}
