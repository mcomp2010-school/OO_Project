package org.info.menu.iterators;

import org.info.menu.Menu;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IngredientMenuIteratorTest</code> contains tests for the class <code>{@link IngredientMenuIterator}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class IngredientMenuIteratorTest {
	/**
	 * Run the IngredientMenuIterator(Menu) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testIngredientMenuIterator_1()
		throws Exception {
		Menu menuObj = new Menu();

		IngredientMenuIterator result = new IngredientMenuIterator(menuObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the IngredientMenuIterator(Menu,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testIngredientMenuIterator_2()
		throws Exception {
		Menu menuObj = new Menu();
		String ingredient = "";

		IngredientMenuIterator result = new IngredientMenuIterator(menuObj, ingredient);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testHasNext_1()
		throws Exception {
		IngredientMenuIterator fixture = new IngredientMenuIterator(new Menu(), "");
		fixture.next();

		boolean result = fixture.hasNext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.IngredientMenuIterator.next(IngredientMenuIterator.java:85)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testHasNext_2()
		throws Exception {
		IngredientMenuIterator fixture = new IngredientMenuIterator(new Menu(), "");
		fixture.next();

		boolean result = fixture.hasNext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.IngredientMenuIterator.next(IngredientMenuIterator.java:85)
		assertTrue(result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testNext_1()
		throws Exception {
		IngredientMenuIterator fixture = new IngredientMenuIterator(new Menu(), "");
		fixture.next();

		Object result = fixture.next();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.IngredientMenuIterator.next(IngredientMenuIterator.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		IngredientMenuIterator fixture = new IngredientMenuIterator(new Menu(), "");
		fixture.next();

		fixture.remove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.IngredientMenuIterator.next(IngredientMenuIterator.java:85)
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
		new org.junit.runner.JUnitCore().run(IngredientMenuIteratorTest.class);
	}
}