package mg.dynamic;

/**
 * http://www.geeksforgeeks.org/count-number-binary-strings-without-consecutive-
 * 1s/
 *
 */
public class BinWithoutOne {

	private int countBinaryStr(int n) {
		int a[] = new int[n];
		int b[] = new int[n];

		a[0] = b[0] = 1;

		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}

		return a[n - 1] + b[n - 1];
	}

	public static void main(String[] args) {
		BinWithoutOne obj = new BinWithoutOne();
		int res = obj.countBinaryStr(3);
		System.out.println(res);
	}

}
