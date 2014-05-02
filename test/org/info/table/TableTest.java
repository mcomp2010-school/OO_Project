package org.info.table;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TableTest</code> contains tests for the class <code>{@link Table}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class TableTest {
	/**
	 * Run the Table(Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testTable_1()
		throws Exception {
		Integer tableID = new Integer(1);
		Integer size = new Integer(1);

		Table result = new Table(tableID, size);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Table [tableID=1;;; size=1;;; isAvailable=true]\t-1", result.toString());
		assertEquals(new Integer(1), result.getSize());
		assertEquals(true, result.isAvailable());
		assertEquals(new Integer(1), result.getTableID());
		assertEquals(new Integer(-1), result.getExpirationTime());
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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Table obj = new Table(new Integer(1), new Integer(1));
		obj.setAvailable(true);
		obj.setExpirationTime(1);

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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Table obj = new Table(new Integer(1), new Integer(1));
		obj.setAvailable(true);

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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Table obj = new Table(new Integer(1), new Integer(1));
		obj.setAvailable(true);

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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Table obj = new Table(new Integer(1), new Integer(1));
		obj.setAvailable(true);

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
	public void testEquals_7()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Table obj = new Table(new Integer(1), new Integer(1));
		obj.setAvailable(true);

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
	public void testEquals_8()
		throws Exception {
		Table fixture = new Table((Integer) null, new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Table obj = new Table((Integer) null, new Integer(1));
		obj.setAvailable(true);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Integer getExpirationTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetExpirationTime_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);

		Integer result = fixture.getExpirationTime();

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
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);

		Integer result = fixture.getSize();

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
	 * Run the Integer getTableID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetTableID_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);

		Integer result = fixture.getTableID();

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
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1212814, result);
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
		Table fixture = new Table((Integer) null, (Integer) null);
		fixture.setAvailable(false);
		fixture.setExpirationTime(1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1218548, result);
	}

	/**
	 * Run the boolean isAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testIsAvailable_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);

		boolean result = fixture.isAvailable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testIsAvailable_2()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(false);
		fixture.setExpirationTime(1);

		boolean result = fixture.isAvailable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAvailable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetAvailable_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		boolean isAvailable = true;

		fixture.setAvailable(isAvailable);

		// add additional test code here
	}

	/**
	 * Run the void setExpirationTime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetExpirationTime_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		int inputTime = 1;

		fixture.setExpirationTime(inputTime);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setTableID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetTableID_1()
		throws Exception {
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);
		Integer tableID = new Integer(1);

		fixture.setTableID(tableID);

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
		Table fixture = new Table(new Integer(1), new Integer(1));
		fixture.setAvailable(true);
		fixture.setExpirationTime(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Table [tableID=1;;; size=1;;; isAvailable=true]\t1", result);
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
		new org.junit.runner.JUnitCore().run(TableTest.class);
	}
}