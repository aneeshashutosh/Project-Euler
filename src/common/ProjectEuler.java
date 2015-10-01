package common;

/**
 * @author aneeshashutosh
 *
 *         The main class for all Project Euler problems. Times the runtime of each problem.
 */

public class ProjectEuler {
	public static void main (String[] args) {
		Timer.startTimer();

		// problem1.MultiplesOf3And5.run();
		// problem2.EvenFibonacciNumbers.run();
		// problem3.LargestPrimeFactor.run();
		problem4.LargestPalindromeProduct.run();

		Timer.endTimer();
	}
}
