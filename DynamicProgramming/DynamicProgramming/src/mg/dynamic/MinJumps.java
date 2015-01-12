package mg.dynamic;

public class MinJumps {

	private int minJumps(int arr[], int n) {

		if (n == 0 || arr[0] == 0)
			return 0;

		int[] jumps = new int[n];

		jumps[0] = 0;

		for (int i = 1; i < n; i++) {
			jumps[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
				}
			}
		}

		return jumps[n - 1];

	}

	public static void main(String[] args) {
		MinJumps minJumps = new MinJumps();
		int arr[] = { 1, 3, 6, 1, 0, 9 };

		int result = minJumps.minJumps(arr, arr.length);
		System.out.println(result);
	}
}
