package mg.dynamic;

public class CuttingRod {

	private int cutRod(int price[], int n) {
		if (n <= 0) {
			return 0;
		}

		int res = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {

			res = Math.max(res, price[i] + cutRod(price, n - i - 1));

		}

		return res;

	}

	public static void main(String[] args) {
		CuttingRod cRod = new CuttingRod();
		int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int result = cRod.cutRod(arr, arr.length);

		System.out.println(result);

	}

}
