package org.party;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PartyManagerTest</code> contains tests for the class <code>{@link PartyManager}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class PartyManagerTest {
	/**
	 * Run the PartyManager() constructor test.
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testPartyManager_1()
		throws Exception {
		PartyManager result = new PartyManager();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ArrayList<PartyItem> getFinishParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetFinishParties_1()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getFinishParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getFinishParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetFinishParties_2()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getFinishParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getFinishParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetFinishParties_3()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getFinishParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PartyItem getPartyByID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetPartyByID_1()
		throws Exception {
		PartyManager fixture = new PartyManager();
		Integer inputID = new Integer(1);

		PartyItem result = fixture.getPartyByID(inputID);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArrayList<PartyItem> getSeatedParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetSeatedParties_1()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getSeatedParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getSeatedParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetSeatedParties_2()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getSeatedParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getSeatedParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetSeatedParties_3()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getSeatedParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getWaitingParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetWaitingParties_1()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getWaitingParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getWaitingParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetWaitingParties_2()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getWaitingParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ArrayList<PartyItem> getWaitingParties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetWaitingParties_3()
		throws Exception {
		PartyManager fixture = new PartyManager();

		ArrayList<PartyItem> result = fixture.getWaitingParties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Integer newParty(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testNewParty_1()
		throws Exception {
		PartyManager fixture = new PartyManager();
		int size = 1;

		Integer result = fixture.newParty(size);

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
	 * Run the void removePartybyID(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testRemovePartybyID_1()
		throws Exception {
		PartyManager fixture = new PartyManager();
		Integer inputID = new Integer(1);

		fixture.removePartybyID(inputID);

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
		PartyManager fixture = new PartyManager();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
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
		PartyManager fixture = new PartyManager();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
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
		PartyManager fixture = new PartyManager();

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
		new org.junit.runner.JUnitCore().run(PartyManagerTest.class);
	}
}