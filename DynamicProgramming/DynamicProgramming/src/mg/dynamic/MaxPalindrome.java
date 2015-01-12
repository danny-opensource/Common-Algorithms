package mg.dynamic;

public class MaxPalindrome {

	private int maxPalindrome(char[] seq, int i, int j) {

		if (i == j)
			return 1;

		if (seq[i] == seq[j] && i + 1 == j)
			return 2;

		if (seq[i] == seq[j])
			return maxPalindrome(seq, i + 1, j - 1) + 2;

		return Math.max(maxPalindrome(seq, i + 1, j),
				maxPalindrome(seq, i, j - 1));
	}

	public static void main(String[] args) {
		MaxPalindrome maxPal = new MaxPalindrome();
		char[] seq = { 'B', 'B', 'A', 'B', 'C', 'B', 'C', 'A', 'B' };
		int result = maxPal.maxPalindrome(seq, 0, seq.length - 1);
		System.out.println(result);
	}
}
