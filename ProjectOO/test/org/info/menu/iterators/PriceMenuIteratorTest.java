package org.info.menu.iterators;

import org.info.menu.Menu;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PriceMenuIteratorTest</code> contains tests for the class <code>{@link PriceMenuIterator}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class PriceMenuIteratorTest {
	/**
	 * Run the PriceMenuIterator(Menu) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testPriceMenuIterator_1()
		throws Exception {
		Menu menuObj = new Menu();

		PriceMenuIterator result = new PriceMenuIterator(menuObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the PriceMenuIterator(Menu,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testPriceMenuIterator_2()
		throws Exception {
		Menu menuObj = new Menu();
		double price = 1.0;

		PriceMenuIterator result = new PriceMenuIterator(menuObj, price);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testHasNext_1()
		throws Exception {
		PriceMenuIterator fixture = new PriceMenuIterator(new Menu(), 1.0);
		fixture.next();

		boolean result = fixture.hasNext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.PriceMenuIterator.next(PriceMenuIterator.java:86)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testHasNext_2()
		throws Exception {
		PriceMenuIterator fixture = new PriceMenuIterator(new Menu(), 1.0);
		fixture.next();

		boolean result = fixture.hasNext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.PriceMenuIterator.next(PriceMenuIterator.java:86)
		assertTrue(result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testNext_1()
		throws Exception {
		PriceMenuIterator fixture = new PriceMenuIterator(new Menu(), 1.0);
		fixture.next();

		Object result = fixture.next();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.PriceMenuIterator.next(PriceMenuIterator.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		PriceMenuIterator fixture = new PriceMenuIterator(new Menu(), 1.0);
		fixture.next();

		fixture.remove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.info.menu.Menu.get(Menu.java:161)
		//       at org.info.menu.iterators.PriceMenuIterator.next(PriceMenuIterator.java:86)
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
		new org.junit.runner.JUnitCore().run(PriceMenuIteratorTest.class);
	}
}