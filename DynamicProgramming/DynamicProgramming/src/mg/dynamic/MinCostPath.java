package mg.dynamic;

public class MinCostPath {

	private int minCostPath(int[][] cost, int i, int j) {

		if (i < 0 || j < 0)
			return Integer.MAX_VALUE;

		if (i == 0 && j == 0)
			return cost[i][j];

		int left = minCostPath(cost, i, j - 1);
		int up = minCostPath(cost, i - 1, j);
		int diag = minCostPath(cost, i - 1, j - 1);

		return cost[i][j] + Math.min(Math.min(left, up), diag);
	}

	public static void main(String[] args) {
		MinCostPath minPath = new MinCostPath();
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		int res = minPath.minCostPath(cost, 2, 2);
		System.out.println(res);
	}

}
