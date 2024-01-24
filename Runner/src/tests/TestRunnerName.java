package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Runner;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 19, 2024
 */
public class TestRunnerName {

	Runner runner = new Runner("Jeff");
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testRunnerIsNotNull() {
		assertNotNull(runner);
	}

	@Test
	public void testRunnerName() {
		assertEquals("Jeff" , runner.getName());
	}
	

}
