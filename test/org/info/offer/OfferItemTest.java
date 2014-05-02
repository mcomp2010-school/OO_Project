package org.info.offer;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OfferItemTest</code> contains tests for the class <code>{@link OfferItem}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class OfferItemTest {
	/**
	 * Run the OfferItem(String,double,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testOfferItem_1()
		throws Exception {
		String menuItemCategory = "";
		double discountPercentage = 1.0;
		String offerItemName = "";
		int numberOfTimesApplied = 1;

		OfferItem result = new OfferItem(menuItemCategory, discountPercentage, offerItemName, numberOfTimesApplied);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getNumOfTimesApplied());
		assertEquals("", result.getOfferItemCategory());
		assertEquals(1.0, result.getDiscountPercent(), 1.0);
		assertEquals("", result.getOfferItemName());
	}

	/**
	 * Run the double getDiscountPercent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetDiscountPercent_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);

		double result = fixture.getDiscountPercent();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the int getNumOfTimesApplied() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetNumOfTimesApplied_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);

		int result = fixture.getNumOfTimesApplied();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getOfferItemCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetOfferItemCategory_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);

		String result = fixture.getOfferItemCategory();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getOfferItemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetOfferItemName_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);

		String result = fixture.getOfferItemName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setDiscountPercent(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetDiscountPercent_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);
		double percent = 1.0;

		fixture.setDiscountPercent(percent);

		// add additional test code here
	}

	/**
	 * Run the void setNumTimesApplied(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetNumTimesApplied_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);
		int number = 1;

		fixture.setNumTimesApplied(number);

		// add additional test code here
	}

	/**
	 * Run the void setOfferItemCategory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetOfferItemCategory_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);
		String category = "";

		fixture.setOfferItemCategory(category);

		// add additional test code here
	}

	/**
	 * Run the void setOfferItemName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetOfferItemName_1()
		throws Exception {
		OfferItem fixture = new OfferItem("", 1.0, "", 1);
		String name = "";

		fixture.setOfferItemName(name);

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
		new org.junit.runner.JUnitCore().run(OfferItemTest.class);
	}
}