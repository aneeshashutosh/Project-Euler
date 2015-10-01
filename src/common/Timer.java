package common;

/**
 * @author aneeshashutosh
 * @package common
 */
public class Timer {
	private static long startTime;
	private static long endTime;

	public Timer() {
		super();
	}

	public static void startTimer() {
		Timer.startTime = System.currentTimeMillis();
	}

	public static void endTimer() {
		Timer.endTime = System.currentTimeMillis();
		System.out.println("Runtime: " + (Timer.endTime - Timer.startTime) + " milliseconds.");
	}
}
