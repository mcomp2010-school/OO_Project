package org.command;

import org.commands.GetCMDAllSampleOrdersCommand;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InvokerTest</code> contains tests for the class <code>{@link Invoker}</code>.
 *
 * @generatedBy CodePro at 5/9/13 7:45 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class InvokerTest {
	/**
	 * Run the Invoker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testInvoker_1()
		throws Exception {

		Invoker result = new Invoker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object executeCommand(Command) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/13 7:45 AM
	 */
	@Test
	public void testExecuteCommand_1()
		throws Exception {
		Invoker fixture = new Invoker();
		fixture.executeCommand(new GetCMDAllSampleOrdersCommand());
		Command command = new GetCMDAllSampleOrdersCommand();

		Object result = fixture.executeCommand(command);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.info.menu.Menu.loadXML(Menu.java:297)
		//       at org.info.InformationProvider.<init>(InformationProvider.java:55)
		//       at org.info.InformationProvider.getSingletonObject(InformationProvider.java:81)
		//       at org.commands.GetCMDAllSampleOrdersCommand.<init>(GetCMDAllSampleOrdersCommand.java:11)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(InvokerTest.class);
	}
}