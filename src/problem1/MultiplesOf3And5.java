package problem1;

/**
 * @author aneeshashutosh
 * @package problem1
 * <p/>
 * Problem 1.
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5,
 * 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or
 * 5 below 1000.
 * <p/>
 * Answer: 233168
 */

public class MultiplesOf3And5 {
	public static void run () {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				// If the number is divisible by three or five, adds it to the sum.
				sum += i;
			}
		}

		System.out.println(sum);
	}
}