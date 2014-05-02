package org.system;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SystemInterfaceTest</code> contains tests for the class <code>{@link SystemInterface}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class SystemInterfaceTest {
	/**
	 * Run the SystemInterface() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testSystemInterface_1()
		throws Exception {

		SystemInterface result = new SystemInterface();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getGetCompleteMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetGetCompleteMenu_1()
		throws Exception {
		SystemInterface fixture = new SystemInterface();

		String result = fixture.getGetCompleteMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDCompleteMenuCommand.<init>(GetCMDCompleteMenuCommand.java:13)
		//       at org.system.SystemInterface.getGetCompleteMenu(SystemInterface.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the String getHeartHealthyMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetHeartHealthyMenu_1()
		throws Exception {
		SystemInterface fixture = new SystemInterface();

		String result = fixture.getHeartHealthyMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDHeartHealthyMenuCommand.<init>(GetCMDHeartHealthyMenuCommand.java:13)
		//       at org.system.SystemInterface.getHeartHealthyMenu(SystemInterface.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the String getIngredientMenu(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetIngredientMenu_1()
		throws Exception {
		SystemInterface fixture = new SystemInterface();
		String ingredient = "";

		String result = fixture.getIngredientMenu(ingredient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDIngredientMenuCommand.<init>(GetCMDIngredientMenuCommand.java:11)
		//       at org.system.SystemInterface.getIngredientMenu(SystemInterface.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the String getPriceMenu(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetPriceMenu_1()
		throws Exception {
		SystemInterface fixture = new SystemInterface();
		double maxPrice = 1.0;

		String result = fixture.getPriceMenu(maxPrice);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDPriceMenuCommand.<init>(GetCMDPriceMenuCommand.java:12)
		//       at org.system.SystemInterface.getPriceMenu(SystemInterface.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the String getSampleOrders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetSampleOrders_1()
		throws Exception {
		SystemInterface fixture = new SystemInterface();

		String result = fixture.getSampleOrders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDAllSampleOrdersCommand.<init>(GetCMDAllSampleOrdersCommand.java:11)
		//       at org.system.SystemInterface.getSampleOrders(SystemInterface.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the String getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetTables_1()
		throws Exception {
		SystemInterface fixture = new SystemInterface();

		String result = fixture.getTables();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDTables.<init>(GetCMDTables.java:14)
		//       at org.system.SystemInterface.getTables(SystemInterface.java:69)
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
		new org.junit.runner.JUnitCore().run(SystemInterfaceTest.class);
	}
}