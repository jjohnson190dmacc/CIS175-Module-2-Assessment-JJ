package model;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 19, 2024
 */
public class Runner {

	private String name;
	// distance in miles
	private double distanceRun;
	private int totalMinutes;

	
	
	public Runner() {
		
	}
	
	public Runner(String name) {
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistanceRun() {
		return distanceRun;
	}

	public void setDistanceRun(double distanceRun) {
		this.distanceRun = distanceRun;
	}

	public int getTotalMinutes() {
		return totalMinutes;
	}

	public void setTotalMinutes(int totalMinutes) {
		this.totalMinutes = totalMinutes;
	}
	
	public double convertMinutesToHours(Runner runner) {
		
		final double MINUTES_IN_HOUR = 60.0;
		double hours = 0;
		hours = runner.getTotalMinutes()/MINUTES_IN_HOUR;
		return hours;
	}
	
	public String convertRunToRating(Runner runner) {
	
		String rating = "Poor";
		
		// based roughly on Presidential Fitness Program, male age 17
		// 1 mile in 5 minutes = Great (1/6=0.167)
		// 1 mile in 6 minutes = Average (1/7=0.142)
		double ratingGreat = 0.167;
		double ratingAverage = 0.142;
		
		if ((runner.getDistanceRun()/runner.getTotalMinutes()) > ratingGreat ) {
			rating = "Great";
		} else if ((runner.getDistanceRun()/runner.getTotalMinutes()) > ratingAverage ) {
			rating = "Average";
		}
		
		return rating;
	}
	
}
