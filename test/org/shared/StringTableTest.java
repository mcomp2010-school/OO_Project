package org.shared;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StringTableTest</code> contains tests for the class <code>{@link StringTable}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class StringTableTest {
	/**
	 * Run the StringTable() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testStringTable_1()
		throws Exception {

		StringTable result = new StringTable();

		// add additional test code here
		assertNotNull(result);
		assertEquals("\n", result.toString());
		assertEquals(0, result.size());
		assertEquals(0, result.getColumnNumber());
		assertEquals("", result.toStringBodyDel());
		assertEquals(null, result.getArrColumnHeader());
		assertEquals(0, result.getArrLRowsSize());
		assertEquals(null, result.getStrDelimiter());
	}

	/**
	 * Run the StringTable(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testStringTable_2()
		throws Exception {
		String strConRaw = "";
		String strDelimiter = "";

		StringTable result = new StringTable(strConRaw, strDelimiter);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\n", result.toString());
		assertEquals(0, result.size());
		assertEquals(1, result.getColumnNumber());
		assertEquals("", result.toStringBodyDel());
		assertEquals(0, result.getArrLRowsSize());
		assertEquals("", result.getStrDelimiter());
	}

	/**
	 * Run the void Remove1stArrLRows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testRemove1stArrLRows_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		fixture.Remove1stArrLRows();

		// add additional test code here
	}

	/**
	 * Run the void clearArrLRows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testClearArrLRows_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");

		fixture.clearArrLRows();

		// add additional test code here
	}

	/**
	 * Run the String[] get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		int intIndex = -1;

		String[] result = fixture.get(intIndex);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("ERROR-Out of Range", result[0]);
	}

	/**
	 * Run the String[] get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		int intIndex = 1;

		String[] result = fixture.get(intIndex);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("ERROR-Out of Range", result[0]);
	}

	/**
	 * Run the String[] getArrColumnHeader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetArrColumnHeader_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String[] result = fixture.getArrColumnHeader();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the ArrayList<String[]> getArrLRows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetArrLRows_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		ArrayList<String[]> result = fixture.getArrLRows();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the int getArrLRowsSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetArrLRowsSize_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		int result = fixture.getArrLRowsSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getColumnNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnNumber_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		int result = fixture.getColumnNumber();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getColumnValue(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValue_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnName = "";
		int intIndex = 1;

		String result = fixture.getColumnValue(strColumnName, intIndex);

		// add additional test code here
		assertEquals("ERROR-Column Name not found = ", result);
	}

	/**
	 * Run the String getColumnValue(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValue_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnName = "";
		int intIndex = -1;

		String result = fixture.getColumnValue(strColumnName, intIndex);

		// add additional test code here
		assertEquals("ERROR-Column Name not found = ", result);
	}

	/**
	 * Run the String getColumnValue(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValue_3()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnName = "";
		int intIndex = 1;

		String result = fixture.getColumnValue(strColumnName, intIndex);

		// add additional test code here
		assertEquals("ERROR-Column Name not found = ", result);
	}

	/**
	 * Run the String getColumnValue(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValue_4()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnName = "";
		int intIndex = -1;

		String result = fixture.getColumnValue(strColumnName, intIndex);

		// add additional test code here
		assertEquals("ERROR-Column Name not found = ", result);
	}

	/**
	 * Run the String getColumnValue(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValue_5()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnName = "";
		int intIndex = -1;

		String result = fixture.getColumnValue(strColumnName, intIndex);

		// add additional test code here
		assertEquals("ERROR-Column Name not found = ", result);
	}

	/**
	 * Run the String getColumnValueArray(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValueArray_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		int intArrayIndex = 1;
		int intIndex = -1;

		String result = fixture.getColumnValueArray(intArrayIndex, intIndex);

		// add additional test code here
		assertEquals("ERROR-Out of Range", result);
	}

	/**
	 * Run the String getColumnValueArray(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetColumnValueArray_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		int intArrayIndex = 1;
		int intIndex = 1;

		String result = fixture.getColumnValueArray(intArrayIndex, intIndex);

		// add additional test code here
		assertEquals("ERROR-Out of Range", result);
	}

	/**
	 * Run the String getStrDelimiter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetStrDelimiter_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.getStrDelimiter();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void insertStringArray(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringArray_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String[] inputArray = new String[] {};

		fixture.insertStringArray(inputArray);

		// add additional test code here
	}

	/**
	 * Run the void insertStringArray(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringArray_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String[] inputArray = new String[] {};

		fixture.insertStringArray(inputArray);

		// add additional test code here
	}

	/**
	 * Run the void insertStringColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringColumn_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strConRaw = "";

		fixture.insertStringColumn(strConRaw);

		// add additional test code here
	}

	/**
	 * Run the void insertStringColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringColumn_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strConRaw = "";

		fixture.insertStringColumn(strConRaw);

		// add additional test code here
	}

	/**
	 * Run the void insertStringColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringColumn_3()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strConRaw = "";

		fixture.insertStringColumn(strConRaw);

		// add additional test code here
	}

	/**
	 * Run the void insertStringColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringColumn_4()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strConRaw = "";

		fixture.insertStringColumn(strConRaw);

		// add additional test code here
	}

	/**
	 * Run the void insertStringColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testInsertStringColumn_5()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strConRaw = "";

		fixture.insertStringColumn(strConRaw);

		// add additional test code here
	}

	/**
	 * Run the void qsort(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testQsort_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnId = "";

		fixture.qsort(strColumnId);

		// add additional test code here
	}

	/**
	 * Run the void qsort(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testQsort_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strColumnId = "";

		fixture.qsort(strColumnId);

		// add additional test code here
	}

	/**
	 * Run the void setArrColumnHeader(String[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetArrColumnHeader_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		String[] arrColumnHeader = new String[] {};
		String StrDelimiter = "";

		fixture.setArrColumnHeader(arrColumnHeader, StrDelimiter);

		// add additional test code here
	}

	/**
	 * Run the void setStrDelimiter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSetStrDelimiter_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});
		String strDelimiter = "";

		fixture.setStrDelimiter(strDelimiter);

		// add additional test code here
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		int result = fixture.size();

		// add additional test code here
		assertEquals(1, result);
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
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toString();

		// add additional test code here
		assertEquals("\n\n", result);
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
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toString();

		// add additional test code here
		assertEquals("\n\n", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toString();

		// add additional test code here
		assertEquals("\n\n", result);
	}

	/**
	 * Run the String toStringBodyDel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToStringBodyDel_1()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toStringBodyDel();

		// add additional test code here
		assertEquals("\n", result);
	}

	/**
	 * Run the String toStringBodyDel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToStringBodyDel_2()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toStringBodyDel();

		// add additional test code here
		assertEquals("\n", result);
	}

	/**
	 * Run the String toStringBodyDel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToStringBodyDel_3()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toStringBodyDel();

		// add additional test code here
		assertEquals("\n", result);
	}

	/**
	 * Run the String toStringBodyDel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToStringBodyDel_4()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");
		fixture.insertStringArray(new String[] {});

		String result = fixture.toStringBodyDel();

		// add additional test code here
		assertEquals("\n", result);
	}

	/**
	 * Run the String toStringBodyDel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testToStringBodyDel_5()
		throws Exception {
		StringTable fixture = new StringTable("", "");
		fixture.setArrColumnHeader(new String[] {}, "");

		String result = fixture.toStringBodyDel();

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
		new org.junit.runner.JUnitCore().run(StringTableTest.class);
	}
}