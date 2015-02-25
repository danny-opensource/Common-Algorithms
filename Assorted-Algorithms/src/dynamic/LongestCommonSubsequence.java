package dynamic;

public class LongestCommonSubsequence {

	private int lcs(char[] x, char[] y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;

		if (x[m - 1] == y[n - 1]) {
			return 1 + lcs(x, y, m - 1, n - 1);
		}
		return Math.max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
	}

	public static void main(String[] args) {
		LongestCommonSubsequence obj = new LongestCommonSubsequence();
		char[] x = new char[] { 'A', 'G', 'G', 'T', 'A', 'B' };
		char[] y = new char[] { 'G', 'X', 'T', 'X', 'A', 'Y','B' };

		int seq = obj.lcs(x, y, x.length, y.length);
		
		System.out.println(seq);
	}

}
