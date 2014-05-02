package org.info.menu;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MenuTest</code> contains tests for the class <code>{@link Menu}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class MenuTest {
	/**
	 * Run the Menu() constructor test.
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testMenu_1()
		throws Exception {
		Menu result = new Menu();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addItem(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		MenuItem next = new MenuItem(new Integer(1), "", new Double(1.0), "", "");

		fixture.addItem(next);

		// add additional test code here
	}

	/**
	 * Run the void addItem(String,Double,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		String itemName = "";
		Double price = new Double(1.0);
		String mainIngredient = "";
		String category = "";

		fixture.addItem(itemName, price, mainIngredient, category);

		// add additional test code here
	}

	/**
	 * Run the void addItem(String,Double,String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testAddItem_3()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		String itemName = "";
		Double price = new Double(1.0);
		String mainIngredient = "";
		boolean isHeartHealthy = true;
		String category = "";

		fixture.addItem(itemName, price, mainIngredient, isHeartHealthy, category);

		// add additional test code here
	}

	/**
	 * Run the boolean contains(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Object o = new Object();

		boolean result = fixture.contains(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Object o = new Object();

		boolean result = fixture.contains(o);

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
	public void testEquals_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Menu obj = new Menu();
		obj.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Menu obj = new Menu();
		obj.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

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
	public void testEquals_5()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Menu obj = new Menu();
		obj.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

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
	public void testEquals_6()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Menu obj = new Menu();
		obj.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the MenuItem get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		int index = 1;

		MenuItem result = fixture.get(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getItemByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByID_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Integer inputID = new Integer(1);

		MenuItem result = fixture.getItemByID(inputID);

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
	 * Run the MenuItem getItemByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByID_2()
		throws Exception {
		Menu fixture = new Menu();
		Integer inputID = new Integer(1);

		MenuItem result = fixture.getItemByID(inputID);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MenuItem getItemByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByID_3()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Integer inputID = new Integer(1);

		MenuItem result = fixture.getItemByID(inputID);

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
	 * Run the ArrayList<MenuItem> getItemByIDs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByIDs_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		String inputString = "";

		ArrayList<MenuItem> result = fixture.getItemByIDs(inputString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<MenuItem> getItemByIDs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByIDs_2()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		String inputString = "";

		ArrayList<MenuItem> result = fixture.getItemByIDs(inputString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<MenuItem> getItemByIDs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByIDs_3()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		String inputString = "";

		ArrayList<MenuItem> result = fixture.getItemByIDs(inputString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<MenuItem> getItemByIDs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetItemByIDs_4()
		throws Exception {
		Menu fixture = new Menu();
		String inputString = "";

		ArrayList<MenuItem> result = fixture.getItemByIDs(inputString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String[] getUniqueIngredients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetUniqueIngredients_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		String[] result = fixture.getUniqueIngredients();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getUniqueIngredients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetUniqueIngredients_2()
		throws Exception {
		Menu fixture = new Menu();

		String[] result = fixture.getUniqueIngredients();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		String result = fixture.getXML();

		// add additional test code here
		assertEquals("<list>\n  <MenuItem ItemID=\"1\">\n    <itemName></itemName>\n    <Price>1.0</Price>\n    <MainIngredient></MainIngredient>\n    <isHeartHealthy>false</isHeartHealthy>\n    <timeSec>0</timeSec>\n    <category></category>\n  </MenuItem>\n</list>", result);
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1329776717, result);
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1329776717, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		Menu fixture = new Menu();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(false, result);
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
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
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
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_3()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_4()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_5()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_6()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_7()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_8()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_9()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_10()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_11()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_12()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_13()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_14()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_15()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the void loadXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testLoadXML_16()
		throws Exception {
		Menu fixture = new Menu();
		String FileName = "";

		fixture.loadXML(FileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
	}

	/**
	 * Run the MenuItem remove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		int index = 1;

		MenuItem result = fixture.remove(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.remove(Unknown Source)
		//       at org.info.menu.Menu.remove(Menu.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the boolean remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Object o = new Object();

		boolean result = fixture.remove(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
		Object o = new Object();

		boolean result = fixture.remove(o);

		// add additional test code here
		assertEquals(false, result);
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
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
		//       at org.info.menu.Menu.saveXML(Menu.java:329)
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));
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
		//       at org.info.menu.Menu.saveXML(Menu.java:329)
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		int result = fixture.size();

		// add additional test code here
		assertEquals(1, result);
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
		Menu fixture = new Menu();
		fixture.addItem(new MenuItem(new Integer(1), "", new Double(1.0), "", ""));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MenuItem [ItemID=1;;; itemName=;;; Price=1.00;;; MainIngredient=;;; category=]\n", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Menu fixture = new Menu();

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
		new org.junit.runner.JUnitCore().run(MenuTest.class);
	}
}