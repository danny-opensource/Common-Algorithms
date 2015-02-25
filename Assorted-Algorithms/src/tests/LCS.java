package tests;

public class LCS {

	private int lcs(int[] x, int[] y, int m, int n) {

		if (m == 0 || n == 0)
			return 0;

		if (x[m - 1] == y[n - 1]) {
			return 1 + lcs(x, y, m - 1, n - 1);
		}
		return Math.max(lcs(x, y, m - 1, n), lcs(x, y, m, n - 1));
	}

	public static void main(String[] args) {
		LCS obj = new LCS();
		int[] x = new int[] { 1, 2, 3, 4, 1 };
		int[] y = new int[] { 3, 4, 1, 2, 1, 3 };

		int maxVal = obj.lcs(x, y, x.length, y.length);
		System.out.println(maxVal);
	}

}
