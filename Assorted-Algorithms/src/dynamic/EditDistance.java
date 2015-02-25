package dynamic;

public class EditDistance {

	private int editDistance(char[] x, char[] y, int m, int n) {
		if (m == 0 && n == 0)
			return 0;
		if (m == 0) {
			return n;
		}

		if (n == 0) {
			return m;
		}

		int left = editDistance(x, y, m - 1, n) + 1;
		int right = editDistance(x, y, m, n - 1) + 1;
		int val = (x[m - 1] != y[n - 1]) ? 1 : 0;
		int corner = editDistance(x, y, m - 1, n - 1) + val;

		return Math.min(Math.min(left, right), corner);
	}

	public static void main(String[] args) {
		EditDistance ed = new EditDistance();
		char[] x = new char[] { 'a', 'c', 'b' };
		char[] y = new char[] { 'x', 'y', 'a' };
		int cost = ed.editDistance(x, y, x.length, y.length);
		System.out.println(cost);
	}
}
