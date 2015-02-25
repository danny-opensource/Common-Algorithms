package dynamic;

public class LongestPalindromeSequence {

	private int lcs(char[] seq, int i, int j) {

		if (i == j) {
			return 1;
		}

		if (seq[i] == seq[j] && i + 1 == j) {
			return 2;
		}
		if (seq[i] == seq[j]) {
			return lcs(seq, i + 1, j - 1) + 2;
		}

		return Math.max(lcs(seq, i + 1, j), lcs(seq, i, j - 1));
	}

	public static void main(String[] args) {
		LongestPalindromeSequence o = new LongestPalindromeSequence();
		char[] seq = new char[] { 'B', 'B', 'A', 'B', 'C', 'B', 'C', 'A', 'B' };
		int longest = o.lcs(seq, 0, seq.length - 1);
		System.out.println(longest);
	}
}
