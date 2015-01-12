package mg.dynamic;

public class LongestBitonicSeq {

	private int lbs(int[] arr, int n) {
		int lis[] = new int[n];
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

		int lds[] = new int[n];
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

		for (int i = 1; i < n; i++) {
			if (max < lis[i] + lds[i] - 1) {
				max = lis[i] + lds[i] - 1;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		LongestBitonicSeq obj = new LongestBitonicSeq();
		int arr[] = { 1, 11, 2, 10, 4, 5, 2, 1 };
		int result = obj.lbs(arr, arr.length);
		System.out.println(result);
	}
}
