package org.shared;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UtilsTest</code> contains tests for the class <code>{@link Utils}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class UtilsTest {
	/**
	 * Run the Integer[] convertStringArrayToIntegerArray(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testConvertStringArrayToIntegerArray_1()
		throws Exception {
		String[] input = new String[] {""};

		Integer[] result = Utils.convertStringArrayToIntegerArray(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the Integer[] convertStringArrayToIntegerArray(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testConvertStringArrayToIntegerArray_2()
		throws Exception {
		String[] input = new String[] {};

		Integer[] result = Utils.convertStringArrayToIntegerArray(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Utils.main(args);

		// add additional test code here
	}

	/**
	 * Run the Integer randomNumberBetween(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRandomNumberBetween_1()
		throws Exception {
		int Min = 1;
		int Max = 1;

		Integer result = Utils.randomNumberBetween(Min, Max);

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
		new org.junit.runner.JUnitCore().run(UtilsTest.class);
	}
}