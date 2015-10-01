package problem4;

/**
 * @author aneeshashutosh
 *
 *         Problem 4.
 *         A palindromic number reads the same both ways. The largest palindrome made from the
 *         product of two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from
 *         the product of two 3-digit numbers.
 *
 *         Answer: 906609
 */
public class LargestPalindromeProduct {
	private static final int MAX_NUM = 1000;

	public static void run () {
		int largestPalindrome = 0;
		for (int i = LargestPalindromeProduct.MAX_NUM - 1; i > 0; i--) {
			for (int j = LargestPalindromeProduct.MAX_NUM - 1; j > 0; j--) {
				int multiple = j * i;
				if (multiple == reverseNumber(multiple, 0) && multiple > largestPalindrome) {
					largestPalindrome = multiple;
				}
			}
		}
		System.out.println(largestPalindrome);
	}

	/**
	 * Reverses a number recursively.
	 *
	 * @param num       - the number to be reversed.
	 * @param remainder - the remainder from the previous recursive call.
	 *
	 * @return the reversed number.
	 */
	public static int reverseNumber (int num, int remainder) {
		if (num == 0) {
			return remainder;
		}
		return LargestPalindromeProduct.reverseNumber(num / 10, remainder * 10 + num % 10);
	}
}
