package problem2;

import java.util.ArrayList;

/**
 * @author aneeshashutosh
 *
 *         Problem 2.
 *         Each new term in the Fibonacci sequence is generated by adding the previous two terms. By
 *         starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *         By considering the terms in the Fibonacci sequence whose values do not exceed four
 *         million, find the sum of the even-valued terms.
 *
 *         Answer: 4613732
 */

public class EvenFibonacciNumbers {
	private static final int MAX_NUM = 4000000;

	public static void run () {
		ArrayList<Integer> fibNums = new ArrayList<Integer>();
		int smallerFibonacci = 0, largerFibonacci = 1;

		while (largerFibonacci < EvenFibonacciNumbers.MAX_NUM) {
			int fibonacci = smallerFibonacci + largerFibonacci;

			// Checks if the number is even
			if (fibonacci % 2 == 0) {
				fibNums.add(fibonacci);
			}
			smallerFibonacci = largerFibonacci;
			largerFibonacci = fibonacci;
		}

		// Sums the numbers in fibNums
		int sum = 0;
		for (Integer i : fibNums) {
			sum += i;
		}
		System.out.println(sum);
	}
}
