package dynamic;

/**
 * Maximum size square sub-matrix with all 1s
 * http://www.geeksforgeeks.org/maximum
 * -size-sub-matrix-with-all-1s-in-a-binary-matrix/
 * 
 * s *
 */

public class MaxSubMatrix {

	private int[][] m;

	private int[][] s;

	int max_s;
	int max_i = 0;
	int max_j = 0;

	private void printMaxSubSquare(int r, int c) {

		s = new int[r][c];

		for (int i = 0; i < r; i++) {
			s[i][0] = m[i][0];
		}

		for (int j = 0; j < c; j++) {
			s[0][j] = m[0][j];
		}

		for (int i = 1; i < r; i++) {
			for (int j = 1; j < c; j++) {
				if (m[i][j] == 1) {
					s[i][j] = Math.min(Math.min(s[i][j - 1], s[i - 1][j]),
							s[i - 1][j - 1]) + 1;
				} else
					s[i][j] = 0;
			}
		}

		max_s = s[0][0];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (max_s < s[i][j]) {
					max_s = s[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		System.out.println(max_s);
		System.out.println(max_i);
		System.out.println(max_j);
	}

	private void printMatrix() {
		for (int i = max_i; i > max_i - max_s; i--) {
			for (int j = max_j; j > max_j - max_s; j--) {
				System.out.println(m[i][j]);
			}
		}
	}

	public static void main(String[] args) {

		MaxSubMatrix obj = new MaxSubMatrix();

		int M[][] = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
		obj.m = M;

		obj.printMaxSubSquare(6, 5);

		obj.printMatrix();

	}
}