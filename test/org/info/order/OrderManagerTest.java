package org.info.order;

import java.util.ArrayList;
import java.util.TreeMap;
import org.info.menu.MenuItem;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderManagerTest</code> contains tests for the class <code>{@link OrderManager}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class OrderManagerTest {
	/**
	 * Run the OrderManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testOrderManager_1()
		throws Exception {

		OrderManager result = new OrderManager();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.GetTableNumber());
		assertEquals("<tree-map/>", result.getXML());
	}

	/**
	 * Run the OrderManager(Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testOrderManager_2()
		throws Exception {
		Integer tableNum = new Integer(1);

		OrderManager result = new OrderManager(tableNum);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(new Integer(1), result.GetTableNumber());
		assertEquals("<tree-map/>", result.getXML());
	}

	/**
	 * Run the Integer GetTableNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetTableNumber_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		Integer result = fixture.GetTableNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Object obj = new OrderManager(new Integer(1));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Object obj = new OrderManager();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Object obj = new OrderManager();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Object obj = new OrderManager();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the TreeMap<Integer, OrderItem> getAllOrders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetAllOrders_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		TreeMap<Integer, OrderItem> result = fixture.getAllOrders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the OrderItem getOrderByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetOrderByID_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Integer inputID = new Integer(1);

		OrderItem result = fixture.getOrderByID(inputID);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getXML() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetXML_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		String result = fixture.getXML();

		// add additional test code here
		assertEquals("<tree-map/>", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testLoadXML_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.order.OrderManager.loadXML(OrderManager.java:155)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testLoadXML_2()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.order.OrderManager.loadXML(OrderManager.java:155)
	}

	/**
	 * Run the Integer placeOrder(ArrayList<MenuItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testPlaceOrder_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		ArrayList<MenuItem> menuItems = new ArrayList();

		Integer result = fixture.placeOrder(menuItems);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the void removeOrderbyID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testRemoveOrderbyID_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
		Integer inputID = new Integer(1);

		fixture.removeOrderbyID(inputID);

		// add additional test code here
	}

	/**
	 * Run the void saveXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSaveXML_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
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
		//       at org.info.order.OrderManager.saveXML(OrderManager.java:174)
	}

	/**
	 * Run the void saveXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSaveXML_2()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));
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
		//       at org.info.order.OrderManager.saveXML(OrderManager.java:174)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		OrderManager fixture = new OrderManager(new Integer(1));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
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
	 * @generatedBy CodePro at 5/9/13 7:46 AM
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
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderManagerTest.class);
	}
}