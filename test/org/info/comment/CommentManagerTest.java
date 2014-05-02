package org.info.comment;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CommentManagerTest</code> contains tests for the class <code>{@link CommentManager}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class CommentManagerTest {
	/**
	 * Run the CommentManager() constructor test.
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testCommentManager_1()
		throws Exception {
		CommentManager result = new CommentManager();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Integer addComment(String,CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testAddComment_1()
		throws Exception {
		CommentManager fixture = new CommentManager();
		String description = "";
		CommentCategoryE category = CommentCategoryE.ALL;

		Integer result = fixture.addComment(description, category);

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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		CommentManager fixture = new CommentManager();
		Object obj = new CommentManager();

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
		CommentManager fixture = new CommentManager();
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
		CommentManager fixture = new CommentManager();
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
		CommentManager fixture = new CommentManager();
		Object obj = new CommentManager();

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
		CommentManager fixture = new CommentManager();
		Object obj = new CommentManager();

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
		CommentManager fixture = new CommentManager();
		Object obj = new CommentManager();

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
		CommentManager fixture = new CommentManager();
		Object obj = new CommentManager();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the CommentItem getCommentByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentByID_1()
		throws Exception {
		CommentManager fixture = new CommentManager();
		Integer inputID = new Integer(1);

		CommentItem result = fixture.getCommentByID(inputID);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArrayList<CommentItem> getCommentsByCategory(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategory_1()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		ArrayList<CommentItem> result = fixture.getCommentsByCategory(Category);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<CommentItem> getCommentsByCategory(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategory_2()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		ArrayList<CommentItem> result = fixture.getCommentsByCategory(Category);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<CommentItem> getCommentsByCategory(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategory_3()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		ArrayList<CommentItem> result = fixture.getCommentsByCategory(Category);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<CommentItem> getCommentsByCategory(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategory_4()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		ArrayList<CommentItem> result = fixture.getCommentsByCategory(Category);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getCommentsByCategoryStr(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategoryStr_1()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		String result = fixture.getCommentsByCategoryStr(Category);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCommentsByCategoryStr(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategoryStr_2()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		String result = fixture.getCommentsByCategoryStr(Category);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCommentsByCategoryStr(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategoryStr_3()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		String result = fixture.getCommentsByCategoryStr(Category);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCommentsByCategoryStr(CommentCategoryE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testGetCommentsByCategoryStr_4()
		throws Exception {
		CommentManager fixture = new CommentManager();
		CommentCategoryE Category = CommentCategoryE.ALL;

		String result = fixture.getCommentsByCategoryStr(Category);

		// add additional test code here
		assertEquals("", result);
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
		CommentManager fixture = new CommentManager();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
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
		CommentManager fixture = new CommentManager();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	/**
	 * Run the void removeCommentByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRemoveCommentByID_1()
		throws Exception {
		CommentManager fixture = new CommentManager();
		Integer inputID = new Integer(1);

		fixture.removeCommentByID(inputID);

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
		CommentManager fixture = new CommentManager();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
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
		CommentManager fixture = new CommentManager();

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
		new org.junit.runner.JUnitCore().run(CommentManagerTest.class);
	}
}