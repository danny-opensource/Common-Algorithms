package tests;

public class LIS {

	private int lis(int[] seq, int n) {
		int[] lis = new int[n];
		// Memoization
		for (int i = 0; i < n; i++)
			lis[i] = seq[i];

		int maxVal = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (seq[i] >= seq[j] && lis[i] <= lis[j] + seq[i]) {
					lis[i] = lis[j] + seq[i];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (maxVal < lis[i])
				maxVal = lis[i];
		}

		return maxVal;
	}

	public static void main(String[] args) {
		LIS obj = new LIS();
		int[] val = new int[] { 2, -1, 2, 3, 4, -5 };

		int maxVal = obj.lis(val, val.length);

		System.out.println(maxVal);

	}
}