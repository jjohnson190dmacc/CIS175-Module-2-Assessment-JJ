package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Runner;
//import model.RunnerBusinessLogic;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 19, 2024
 */
public class TestRunnerLogic {

	//RunnerBusinessLogic runBL = new RunnerBusinessLogic();
	Runner runner = new Runner("Darlene");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConvertMinutesToHours() {
		
		runner.setTotalMinutes(45);
		double hours = runner.convertMinutesToHours(runner);
		assertEquals(.75 , hours, 0.0);
		
		
	}
	
	@Test
	public void testConvertRunToRating() {
		
		runner.setDistanceRun(3.3);
		runner.setTotalMinutes(20);
		String rating = runner.convertRunToRating(runner);
		assertSame("Average", rating);
	}

}
