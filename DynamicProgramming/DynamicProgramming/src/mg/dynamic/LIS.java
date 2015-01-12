package mg.dynamic;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-3-longest-increasing-
 * subsequence/
 *
 */
public class LIS {

	private int lis(int[] seq, int n) {
		int[] lis = new int[n];

		for (int i = 0; i < n; i++) {
			lis[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (seq[i] > seq[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (max < lis[i]) {
				max = lis[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LIS lis = new LIS();
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int maxVal = lis.lis(arr, arr.length);
		System.out.println(maxVal);
	}

}
