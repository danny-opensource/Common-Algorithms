package mg.dynamic;

/**
 * Longest Common Subsequence
 * http://www.geeksforgeeks.org/dynamic-programming-set
 * -4-longest-common-subsequence/
 * 
 *
 */
public class LCS {

	private int lcs(char[] x, char[] y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;

		if (x[m - 1] == y[n - 1]) {
			return 1 + lcs(x, y, m - 1, n - 1);
		}

		return Math.max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
	}

	public static void main(String[] args) {
		LCS obj = new LCS();
		char[] x = { 'A', 'B', 'C', 'D', 'G', 'H' };
		char[] y = { 'A', 'E', 'D', 'F', 'H', 'R' };
		int val = obj.lcs(x, y, x.length, y.length);
		System.out.println(val);
	}

}
