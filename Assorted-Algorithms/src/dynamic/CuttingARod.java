package dynamic;

public class CuttingARod {

	private int cutRod(int[] price, int n) {
		if (n <= 0)
			return 0;

		int maxVal = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			maxVal = Math.max(maxVal, price[i] + cutRod(price, n - i - 1));
		}
		return maxVal;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		CuttingARod a = new CuttingARod();
		int val = a.cutRod(arr, 8);
		System.out.println(val);
	}
}
