package org.info.order;

import java.util.ArrayList;
import org.info.menu.MenuItem;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderItemTest</code> contains tests for the class <code>{@link OrderItem}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class OrderItemTest {
	/**
	 * Run the OrderItem(Integer,ArrayList<MenuItem>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testOrderItem_1()
		throws Exception {
		Integer orderID = new Integer(1);
		ArrayList<MenuItem> menuItems = new ArrayList();

		OrderItem result = new OrderItem(orderID, menuItems);

		// add additional test code here
		assertNotNull(result);
		assertEquals("OrderItem [orderID=1, MenuItems=[], timeOrdered=2013-05-09 07:46:32.287]", result.toString());
		assertEquals(new Integer(1), result.getOrderID());
	}

	/**
	 * Run the ArrayList<MenuItem> getMenuItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetMenuItems_1()
		throws Exception {
		OrderItem fixture = new OrderItem(new Integer(1), new ArrayList());

		ArrayList<MenuItem> result = fixture.getMenuItems();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Integer getOrderID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetOrderID_1()
		throws Exception {
		OrderItem fixture = new OrderItem(new Integer(1), new ArrayList());

		Integer result = fixture.getOrderID();

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
	 * Run the void setMenuItems(ArrayList<MenuItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetMenuItems_1()
		throws Exception {
		OrderItem fixture = new OrderItem(new Integer(1), new ArrayList());
		ArrayList<MenuItem> menuItems = new ArrayList();

		fixture.setMenuItems(menuItems);

		// add additional test code here
	}

	/**
	 * Run the void setOrderID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetOrderID_1()
		throws Exception {
		OrderItem fixture = new OrderItem(new Integer(1), new ArrayList());
		Integer orderID = new Integer(1);

		fixture.setOrderID(orderID);

		// add additional test code here
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
		OrderItem fixture = new OrderItem(new Integer(1), new ArrayList());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("OrderItem [orderID=1, MenuItems=[], timeOrdered=2013-05-09 07:46:32.343]", result);
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
		new org.junit.runner.JUnitCore().run(OrderItemTest.class);
	}
}