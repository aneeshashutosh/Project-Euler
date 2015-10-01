package problem3;

/**
 * @author aneeshashutosh
 * <p/>
 * Problem 3.
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * <p/>
 * Answer: 6857
 */

public class LargestPrimeFactor {
	private static final long NUM = 600851475143L;

	public static void run () {
		System.out.println(LargestPrimeFactor.getLargestFactor(LargestPrimeFactor.NUM));
	}

	public static long getLargestFactor (long num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return LargestPrimeFactor.getLargestFactor(num / i);
			}
		}
		return num;
	}
}
