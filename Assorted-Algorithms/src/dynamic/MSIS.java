package dynamic;

public class MSIS {
	private int msis(int[] arr, int n) {
		int[] msis = new int[n];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			msis[i] = arr[i];
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && msis[i] < msis[j] + arr[i]) {
					msis[i] = msis[j] + arr[i];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (max < msis[i])
				max = msis[i];
		}

		return max;
	}

	public static void main(String[] args) {
		MSIS m = new MSIS();
		int[] val = new int[] { 1, 101, 2, 3, 100, 4, 5 };

		int res = m.msis(val, val.length);
		System.out.println(res);
	}
}