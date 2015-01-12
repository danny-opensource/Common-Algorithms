package mg.dynamic;

public class MSIS {

	private int msis(int[] seq, int n) {
		int[] msis = new int[n];

		for (int i = 0; i < n; i++) {
			msis[i] = seq[i];
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (seq[i] > seq[j] && msis[i] < msis[j] + seq[i]) {
					msis[i] = msis[j] + seq[i];
				}
			}
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (max < msis[i]) {
				max = msis[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		MSIS obj = new MSIS();
		int[] seq = { 1, 101, 2, 3, 100, 4, 5 };
		int result = obj.msis(seq, seq.length);
		System.out.println(result);
	}
}
