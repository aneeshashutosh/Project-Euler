package problem6;

/**
 * @author aneeshashutosh
 *
 *         Problem 6.
 *         The sum of the squares of the first ten natural numbers is 1^2 + 2^2 + ... + 10^2 = 385
 *         The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)^2 = 552 =
 *         3025, Hence the difference between the sum of the squares of the first ten natural
 *         numbers and the square of the sum is 3025 − 385 = 2640. Find the difference between the
 *         sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 *         Answer: 25164150
 */

public class SumSquareDifference {
	private static final int SIZE = 100;

	public static void run () {
		int squareOfSum = (int) Math.pow(((double) (SumSquareDifference.SIZE *
				(SumSquareDifference.SIZE + 1)) / 2), 2);
		int sumOfSquares = 0;
		for (int i = 0; i <= SumSquareDifference.SIZE; i++) {
			sumOfSquares += i * i;
		}
		System.out.println(squareOfSum - sumOfSquares);
	}
}
