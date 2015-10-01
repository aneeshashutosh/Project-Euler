package common;

/**
 * @author aneeshashutosh
 */
public class Timer {
	private static long startTime;
	private static long endTime;

	public Timer() {
		super();
	}

	public static void startTimer() {
		Timer.startTime = System.nanoTime();
	}

	public static void endTimer() {
		Timer.endTime = System.nanoTime();
		System.out.println("Runtime: " + (Timer.endTime - Timer.startTime) + " nanoseconds.");
	}
}
