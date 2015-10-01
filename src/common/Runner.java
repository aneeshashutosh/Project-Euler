package common;

/**
 * @author aneeshashutosh
 * @package common
 */
public class Runner {
	public static void main (String[] args) {
		Timer.startTimer();

		problem1.MultiplesOf3And5.run();
		// problem2.EvenFibonacciNumbers.run();

		Timer.endTimer();
	}
}
