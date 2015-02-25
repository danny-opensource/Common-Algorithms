package dynamic;

/**
 * Count number of binary strings without consecutive 1�s
 * http://www.geeksforgeeks
 * .org/count-number-binary-strings-without-consecutive-1s/
 * 
 * @author DELL
 *
 */
public class NonConsecOneStrings {

	private int count(int n) {
		int[] a = new int[n];
		int[] b = new int[n];

		a[0] = b[0] = 1;

		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}

		return a[n - 1] + b[n - 1];

	}

	public static void main(String[] args) {
		NonConsecOneStrings obj = new NonConsecOneStrings();
		int val = obj.count(3);
		System.out.println(val);
	}

}
