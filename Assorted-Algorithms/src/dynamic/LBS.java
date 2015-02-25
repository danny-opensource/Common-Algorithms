package dynamic;

/**
 * Longest Bitonic Subsequence
 * http://www.geeksforgeeks.org/dynamic-programming-set
 * -15-longest-bitonic-subsequence/
 * 
 * @author DELL
 *
 */
public class LBS {

	private int lbs(int arr[], int n) {
		int[] lis = new int[n];
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

		int[] lds = new int[n];

		for (int i = 0; i < n; i++) {
			lds[i] = 1;
		}
		for (int i = n - 2; i >= 0; i--) {
			for (int j = n - 1; j > i; j--) {
				if (arr[i] > arr[j] && lds[i] < lds[j] + 1) {
					lds[i] = lds[j] + 1;
				}
			}
		}

		int max = lis[0] + lds[0] - 1;
		for (int i = 0; i < n; i++) {
			if (max < lis[i] + lds[i] - 1) {
				max = lis[i] + lds[i] - 1;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		LBS obj = new LBS();
		int[] val = new int[] { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11,
				7, 15 };
		int maxVal = obj.lbs(val, val.length);
		System.out.println(maxVal);
	}
}
