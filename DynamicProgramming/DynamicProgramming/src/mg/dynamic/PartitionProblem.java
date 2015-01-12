package mg.dynamic;

public class PartitionProblem {

	private boolean isSubset(int[] arr, int n, int sum) {
		if (sum == 0)
			return true;

		if (n == 0 && sum != 0)
			return false;

		if (arr[n - 1] > sum)
			return isSubset(arr, n - 1, sum);

		return isSubset(arr, n - 1, sum)
				|| isSubset(arr, n - 1, sum - arr[n - 1]);

	}

	private boolean findPartition(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		if (sum % 2 != 0) {
			return false;
		}

		return isSubset(arr, n, sum / 2);
	}

	public static void main(String[] args) {
		PartitionProblem prob = new PartitionProblem();
		int[] arr = { 1, 5, 3 };
		boolean result = prob.findPartition(arr, arr.length);
		System.out.println(result);
	}
}
