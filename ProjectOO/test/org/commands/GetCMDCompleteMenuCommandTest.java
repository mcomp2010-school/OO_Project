package org.commands;

import org.info.InformationProvider;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GetCMDCompleteMenuCommandTest</code> contains tests for the class <code>{@link GetCMDCompleteMenuCommand}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:46 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class GetCMDCompleteMenuCommandTest {
	/**
	 * Run the GetCMDCompleteMenuCommand() constructor test.
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testGetCMDCompleteMenuCommand_1()
		throws Exception {
		GetCMDCompleteMenuCommand result = new GetCMDCompleteMenuCommand();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:46 AM
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		GetCMDCompleteMenuCommand fixture = new GetCMDCompleteMenuCommand();
		fixture.infoObj = InformationProvider.getSingletonObject();

		Object result = fixture.execute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDCompleteMenuCommand.<init>(GetCMDCompleteMenuCommand.java:13)
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
		new org.junit.runner.JUnitCore().run(GetCMDCompleteMenuCommandTest.class);
	}
}