package dynamic;

/**
 * Partition Problem (SubSet Sum)
 * http://www.geeksforgeeks.org/dynamic-programming-set-18-partition-problem/
 * 
 * @author DELL
 *
 */
public class PartitionProblem {

	private boolean isSubsetSum(int[] arr, int n, int sum) {
		if (sum == 0)
			return true;

		if (sum != 0 && n == 0)
			return false;

		if (arr[n - 1] > sum)
			return false;

		return isSubsetSum(arr, n - 1, sum)
				|| isSubsetSum(arr, n - 1, sum - arr[n - 1]);
	}

	private boolean findPartition(int[] arr, int n) {
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		if (sum % 2 != 0)
			return false;

		return isSubsetSum(arr, n, sum / 2);
	}
	
	public static void main(String[] args) {
		PartitionProblem prob = new PartitionProblem();
		int arr[] = {1, 5, 11, 5};
		boolean found = prob.findPartition(arr, arr.length);
		
		System.out.println(found);
	}

}
