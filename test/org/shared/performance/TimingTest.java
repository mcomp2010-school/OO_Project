package org.shared.performance;

import java.text.DecimalFormat;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TimingTest</code> contains tests for the class <code>{@link Timing}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class TimingTest {
	/**
	 * Run the Timing() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testTiming_1()
		throws Exception {

		Timing result = new Timing();

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(1.368099993362E9), result.stop_SecDouble());
	}

	/**
	 * Run the String Min_Sec_msa(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testMin_Sec_msa_1()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.Min_Sec_msa(DblFull);

		// add additional test code here
		assertEquals("0:01.0", result);
	}

	/**
	 * Run the String Min_Sec_msa(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testMin_Sec_msa_2()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.Min_Sec_msa(DblFull);

		// add additional test code here
		assertEquals("0:01.0", result);
	}

	/**
	 * Run the String Min_Sec_msa(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testMin_Sec_msa_3()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.Min_Sec_msa(DblFull);

		// add additional test code here
		assertEquals("0:01.0", result);
	}

	/**
	 * Run the String Min_Sec_msa(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testMin_Sec_msa_4()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.Min_Sec_msa(DblFull);

		// add additional test code here
		assertEquals("0:01.0", result);
	}

	/**
	 * Run the String Min_Sec_msa(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testMin_Sec_msa_5()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.Min_Sec_msa(DblFull);

		// add additional test code here
		assertEquals("0:01.0", result);
	}

	/**
	 * Run the String sec_ms(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSec_ms_1()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.sec_ms(DblFull);

		// add additional test code here
		assertEquals("1.0", result);
	}

	/**
	 * Run the String sec_ms(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSec_ms_2()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();
		Double DblFull = new Double(1.0);

		String result = fixture.sec_ms(DblFull);

		// add additional test code here
		assertEquals("1.0", result);
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the Double stop_SecDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testStop_SecDouble_1()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();

		Double result = fixture.stop_SecDouble();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: "1,368,099,993.388"
		//       at sun.misc.FloatingDecimal.readJavaFormatString(Unknown Source)
		//       at java.lang.Double.parseDouble(Unknown Source)
		//       at org.shared.performance.Timing.stop_SecDouble(Timing.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the Double stop_SecDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testStop_SecDouble_2()
		throws Exception {
		Timing fixture = new Timing();
		fixture.decim = new DecimalFormat();

		Double result = fixture.stop_SecDouble();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(TimingTest.class);
	}
}