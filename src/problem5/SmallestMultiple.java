package problem5;

/**
 * @author aneeshashutosh
 *
 *         Problem 5.
 *         2520 is the smallest number that can be divided by each of the numbers from 1 to 10
 *         without any remainder. What is the smallest positive number that is evenly divisible by
 *         all of the numbers from 1 to 20?
 *
 *         Answer: 232792560
 */
public class SmallestMultiple {
	public static void run () {
		int product = 2 * 2 * 2 * 2 * 3 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
		System.out.println(product);
	}
}
