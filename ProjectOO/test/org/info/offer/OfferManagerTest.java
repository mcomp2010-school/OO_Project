package org.info.offer;

import java.util.ArrayList;
import org.info.menu.MenuItem;
import org.info.order.OrderItem;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OfferManagerTest</code> contains tests for the class <code>{@link OfferManager}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class OfferManagerTest {
	/**
	 * Run the OfferManager(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testOfferManager_1()
		throws Exception {
		String offerName = "";

		OfferManager result = new OfferManager(offerName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getOfferName());
		assertEquals("<list/>", result.getXML());
	}

	/**
	 * Run the ArrayList<OfferItem> GetOfferItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetOfferItems_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");

		ArrayList<OfferItem> result = fixture.GetOfferItems();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void addOfferItem(String,double,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testAddOfferItem_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		String menuItemCategory = "";
		double discountPercentage = 1.0;
		int timesApplied = 1;
		String offerItemName = "";

		fixture.addOfferItem(menuItemCategory, discountPercentage, timesApplied, offerItemName);

		// add additional test code here
	}

	/**
	 * Run the void applyOffers(OrderItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testApplyOffers_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		OrderItem order = new OrderItem(new Integer(1), new ArrayList());

		fixture.applyOffers(order);

		// add additional test code here
	}

	/**
	 * Run the void applyOffers(OrderItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testApplyOffers_2()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		OrderItem order = new OrderItem(new Integer(1), new ArrayList());

		fixture.applyOffers(order);

		// add additional test code here
	}

	/**
	 * Run the void applyOffers(OrderItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testApplyOffers_3()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		OrderItem order = new OrderItem(new Integer(1), new ArrayList());

		fixture.applyOffers(order);

		// add additional test code here
	}

	/**
	 * Run the void applyOffers(OrderItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testApplyOffers_4()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		OrderItem order = new OrderItem(new Integer(1), new ArrayList());

		fixture.applyOffers(order);

		// add additional test code here
	}

	/**
	 * Run the void applyOffers(OrderItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testApplyOffers_5()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		OrderItem order = new OrderItem(new Integer(1), new ArrayList());

		fixture.applyOffers(order);

		// add additional test code here
	}

	/**
	 * Run the String getOfferName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetOfferName_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");

		String result = fixture.getOfferName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getXML() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetXML_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");

		String result = fixture.getXML();

		// add additional test code here
		assertEquals("<list/>", result);
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.offer.OfferManager.loadXML(OfferManager.java:130)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_2()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.offer.OfferManager.loadXML(OfferManager.java:130)
	}

	/**
	 * Run the void removeOfferItem(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRemoveOfferItem_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		int index = 1;

		fixture.removeOfferItem(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.remove(Unknown Source)
		//       at org.info.offer.OfferManager.removeOfferItem(OfferManager.java:78)
	}

	/**
	 * Run the void saveXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSaveXML_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		String FileName = "";

		fixture.saveXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at org.apache.commons.io.FileUtils.openOutputStream(FileUtils.java:367)
		//       at org.apache.commons.io.FileUtils.writeStringToFile(FileUtils.java:1928)
		//       at org.apache.commons.io.FileUtils.writeStringToFile(FileUtils.java:1962)
		//       at org.info.offer.OfferManager.saveXML(OfferManager.java:155)
	}

	/**
	 * Run the void saveXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSaveXML_2()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		String FileName = "";

		fixture.saveXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at org.apache.commons.io.FileUtils.openOutputStream(FileUtils.java:367)
		//       at org.apache.commons.io.FileUtils.writeStringToFile(FileUtils.java:1928)
		//       at org.apache.commons.io.FileUtils.writeStringToFile(FileUtils.java:1962)
		//       at org.info.offer.OfferManager.saveXML(OfferManager.java:155)
	}

	/**
	 * Run the void setOfferName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetOfferName_1()
		throws Exception {
		OfferManager fixture = new OfferManager("");
		String name = "";

		fixture.setOfferName(name);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OfferManagerTest.class);
	}
}