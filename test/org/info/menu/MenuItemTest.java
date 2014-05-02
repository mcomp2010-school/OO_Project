package org.info.menu;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MenuItemTest</code> contains tests for the class <code>{@link MenuItem}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class MenuItemTest {
	/**
	 * Run the MenuItem(Integer,String,Double,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testMenuItem_1()
		throws Exception {
		Integer itemID = new Integer(1);
		String itemName = "";
		Double price = new Double(1.0);
		String mainIngredient = "";
		String category = "";

		MenuItem result = new MenuItem(itemID, itemName, price, mainIngredient, category);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MenuItem [ItemID=1;;; itemName=;;; Price=1.00;;; MainIngredient=;;; category=]", result.toString());
		assertEquals(false, result.isHeartHealthy());
		assertEquals("", result.getMainIngredient());
		assertEquals("", result.getCategory());
		assertEquals(0, result.getTimeSec());
		assertEquals("", result.getItemName());
		assertEquals(new Integer(1), result.getItemID());
		assertEquals(new Double(1.0), result.getPrice());
	}

	/**
	 * Run the MenuItem(Integer,String,Double,String,boolean,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testMenuItem_2()
		throws Exception {
		Integer itemID = new Integer(1);
		String itemName = "";
		Double price = new Double(1.0);
		String mainIngredient = "";
		boolean isHeartHealthy = true;
		String category = "";

		MenuItem result = new MenuItem(itemID, itemName, price, mainIngredient, isHeartHealthy, category);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MenuItem [ItemID=1;;; itemName=;;; Price=1.00;;; MainIngredient=;;; category=]", result.toString());
		assertEquals(true, result.isHeartHealthy());
		assertEquals("", result.getMainIngredient());
		assertEquals("", result.getCategory());
		assertEquals(0, result.getTimeSec());
		assertEquals("", result.getItemName());
		assertEquals(new Integer(1), result.getItemID());
		assertEquals(new Double(1.0), result.getPrice());
	}

	/**
	 * Run the MenuItem(Integer,String,Double,String,boolean,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testMenuItem_3()
		throws Exception {
		Integer itemID = new Integer(1);
		String itemName = "";
		Double price = new Double(1.0);
		String mainIngredient = "";
		boolean isHeartHealthy = true;
		int timeSec = 1;
		String category = "";

		MenuItem result = new MenuItem(itemID, itemName, price, mainIngredient, isHeartHealthy, timeSec, category);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MenuItem [ItemID=1;;; itemName=;;; Price=1.00;;; MainIngredient=;;; category=]", result.toString());
		assertEquals(true, result.isHeartHealthy());
		assertEquals("", result.getMainIngredient());
		assertEquals("", result.getCategory());
		assertEquals(1, result.getTimeSec());
		assertEquals("", result.getItemName());
		assertEquals(new Integer(1), result.getItemID());
		assertEquals(new Double(1.0), result.getPrice());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		MenuItem obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		obj.setCategory("");
		obj.setHeartHealthy(true);
		obj.setTimeSec(1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
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
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
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
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		Object obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		Object obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		Object obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		MenuItem obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		obj.setHeartHealthy(true);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		MenuItem obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		obj.setHeartHealthy(true);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		MenuItem fixture = new MenuItem((Integer) null, (String) null, (Double) null, (String) null, "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		MenuItem obj = new MenuItem((Integer) null, (String) null, (Double) null, (String) null, "");
		obj.setHeartHealthy(true);
		obj.setTimeSec(1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		MenuItem obj = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		obj.setHeartHealthy(true);
		obj.setTimeSec(1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String getCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		String result = fixture.getCategory();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Integer getItemID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemID_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		Integer result = fixture.getItemID();

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
	 * Run the String getItemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemName_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		String result = fixture.getItemName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMainIngredient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetMainIngredient_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		String result = fixture.getMainIngredient();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Double getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		Double result = fixture.getPrice();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the int getTimeSec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetTimeSec_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		int result = fixture.getTimeSec();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MenuItem fixture = new MenuItem((Integer) null, "", new Double(1.0), (String) null, "");
		fixture.setCategory("");
		fixture.setHeartHealthy(false);
		fixture.setTimeSec(1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1358405929, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), (String) null, (Double) null, "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(917315824, result);
	}

	/**
	 * Run the boolean isHeartHealthy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testIsHeartHealthy_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		boolean result = fixture.isHeartHealthy();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isHeartHealthy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testIsHeartHealthy_2()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(false);
		fixture.setTimeSec(1);

		boolean result = fixture.isHeartHealthy();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setCategory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetCategory_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		String category = "";

		fixture.setCategory(category);

		// add additional test code here
	}

	/**
	 * Run the void setHeartHealthy(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetHeartHealthy_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		boolean isHeartHealthy = true;

		fixture.setHeartHealthy(isHeartHealthy);

		// add additional test code here
	}

	/**
	 * Run the void setItemName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetItemName_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		String itemName = "";

		fixture.setItemName(itemName);

		// add additional test code here
	}

	/**
	 * Run the void setMainIngredient(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetMainIngredient_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		String mainIngredient = "";

		fixture.setMainIngredient(mainIngredient);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		Double price = new Double(1.0);

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setTimeSec(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetTimeSec_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);
		int timeSec = 1;

		fixture.setTimeSec(timeSec);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MenuItem fixture = new MenuItem(new Integer(1), "", new Double(1.0), "", "");
		fixture.setCategory("");
		fixture.setHeartHealthy(true);
		fixture.setTimeSec(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MenuItem [ItemID=1;;; itemName=;;; Price=1.00;;; MainIngredient=;;; category=]", result);
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
		new org.junit.runner.JUnitCore().run(MenuItemTest.class);
	}
}