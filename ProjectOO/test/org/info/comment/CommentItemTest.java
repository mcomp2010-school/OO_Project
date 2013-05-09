package org.info.comment;

import org.joda.time.DateTime;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CommentItemTest</code> contains tests for the class <code>{@link CommentItem}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class CommentItemTest {
	/**
	 * Run the CommentItem(Integer,String,CommentCategoryE) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testCommentItem_1()
		throws Exception {
		Integer commentItemID = new Integer(1);
		String description = "";
		CommentCategoryE category = CommentCategoryE.ALL;

		CommentItem result = new CommentItem(commentItemID, description, category);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CommentItem [commentItemID=1;;; timePlaced=2013-05-09 07:45:51.418;;; description=;;; category=All ]", result.toString());
		assertEquals("", result.getDescription());
		assertEquals(new Integer(1), result.getCommentItemID());
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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		CommentItem obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		obj.setTimePlaced(new DateTime());

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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		Object obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);

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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		Object obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);

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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		Object obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);

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
	public void testEquals_7()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		CommentItem obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		obj.setTimePlaced(new DateTime());

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
	public void testEquals_8()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		CommentItem obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		obj.setTimePlaced(new DateTime());

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
	public void testEquals_9()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced((DateTime) null);
		CommentItem obj = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		obj.setTimePlaced((DateTime) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the CommentCategoryE getCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());

		CommentCategoryE result = fixture.getCategory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("All ", result.toString());
		assertEquals("ALL", result.name());
		assertEquals(4, result.ordinal());
	}

	/**
	 * Run the Integer getCommentItemID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentItemID_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());

		Integer result = fixture.getCommentItemID();

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
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the DateTime getTimePlaced() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetTimePlaced_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());

		DateTime result = fixture.getTimePlaced();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1368099951498L, result.getMillis());
		assertEquals(2013, result.getYear());
		assertEquals(1, result.getEra());
		assertEquals(4, result.getDayOfWeek());
		assertEquals(129, result.getDayOfYear());
		assertEquals(9, result.getDayOfMonth());
		assertEquals(498, result.getMillisOfSecond());
		assertEquals(51, result.getSecondOfMinute());
		assertEquals(27951, result.getSecondOfDay());
		assertEquals(45, result.getMinuteOfHour());
		assertEquals(465, result.getMinuteOfDay());
		assertEquals(7, result.getHourOfDay());
		assertEquals(20, result.getCenturyOfEra());
		assertEquals(13, result.getYearOfCentury());
		assertEquals(5, result.getMonthOfYear());
		assertEquals(19, result.getWeekOfWeekyear());
		assertEquals(2013, result.getYearOfEra());
		assertEquals(2013, result.getWeekyear());
		assertEquals(27951498, result.getMillisOfDay());
		assertEquals("2013-05-09T07:45:51.498-04:00", result.toString());
		assertEquals(false, result.isEqualNow());
		assertEquals(true, result.isBeforeNow());
		assertEquals(false, result.isAfterNow());
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
		CommentItem fixture = new CommentItem((Integer) null, "", (CommentCategoryE) null);
		fixture.setTimePlaced(new DateTime());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1058977115, result);
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
		CommentItem fixture = new CommentItem(new Integer(1), (String) null, CommentCategoryE.ALL);
		fixture.setTimePlaced((DateTime) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1230590084, result);
	}

	/**
	 * Run the void setCategory(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetCategory_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		CommentCategoryE category = CommentCategoryE.ALL;

		fixture.setCategory(category);

		// add additional test code here
	}

	/**
	 * Run the void setCommentItemID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetCommentItemID_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		Integer commentItemID = new Integer(1);

		fixture.setCommentItemID(commentItemID);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setTimePlaced(DateTime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testSetTimePlaced_1()
		throws Exception {
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());
		DateTime timePlaced = new DateTime();

		fixture.setTimePlaced(timePlaced);

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
		CommentItem fixture = new CommentItem(new Integer(1), "", CommentCategoryE.ALL);
		fixture.setTimePlaced(new DateTime());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("CommentItem [commentItemID=1;;; timePlaced=2013-05-09 07:45:51.554;;; description=;;; category=All ]", result);
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
		new org.junit.runner.JUnitCore().run(CommentItemTest.class);
	}
}