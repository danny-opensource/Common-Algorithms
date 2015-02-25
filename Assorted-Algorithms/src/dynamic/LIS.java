package dynamic;

/**
 * Longest Increasing Subsequence
 * http://www.geeksforgeeks.org/dynamic-programming
 * -set-3-longest-increasing-subsequence/
 * 
 *
 */
public class LIS {

	private int lis(int[] arr, int n) {
		int lis[] = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			lis[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (max < lis[i]) {
				max = lis[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		LIS obj = new LIS();
		int[] val = new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int res = obj.lis(val, val.length);
		System.out.println(res);
	}

}
