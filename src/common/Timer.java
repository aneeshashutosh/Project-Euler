package common;

/**
 * @author aneeshashutosh
 *
 *         A class that calculates the runtime of a program.
 */

public class Timer {
	private static long startTime;
	private static long endTime;

	/**
	 * Gets the current time.
	 */
	public static void startTimer () {
		Timer.startTime = System.currentTimeMillis();
	}

	/**
	 * Gets the time at the end of the run. Prints the total runtime in milliseconds.
	 */
	public static void endTimer () {
		Timer.endTime = System.currentTimeMillis();
		System.out.println("Runtime: " + (Timer.endTime - Timer.startTime) + " milliseconds.");
	}
}
