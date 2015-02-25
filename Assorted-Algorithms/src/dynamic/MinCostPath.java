package dynamic;

public class MinCostPath {

	private int minCost(int[][] cost, int i, int j) {
		if (i < 0 || j < 0)
			return Integer.MAX_VALUE;

		if (i == 0 && j == 0)
			return cost[i][j];

		int left = minCost(cost, i, j - 1);
		int up = minCost(cost, i - 1, j);
		int diag = minCost(cost, i - 1, j - 1);

		return cost[i][j] + Math.min(Math.min(left, up), diag);

	}

	public static void main(String[] args) {
		MinCostPath minCostPath = new MinCostPath();
		int[][] cost = new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		int minCost = minCostPath.minCost(cost, 2, 2);
		System.out.println(minCost);
	}
}
