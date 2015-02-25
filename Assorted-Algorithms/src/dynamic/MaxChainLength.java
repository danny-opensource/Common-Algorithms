package dynamic;

public class MaxChainLength {

	private int maxChainLength(Chain[] c, int n) {
		int[] mil = new int[n];

		for (int i = 0; i < n; i++) {
			mil[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (c[i].a > c[j].b && mil[i] < mil[j] + 1) {
					mil[i] = mil[j] + 1;
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (max < mil[i]) {
				max = mil[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		MaxChainLength m = new MaxChainLength();
		Chain[] c = new Chain[4];
		for (int i = 0; i < 4; i++) {
			c[i] = new Chain();
		}
		c[0].a = 5;
		c[0].b = 24;

		c[1].a = 15;
		c[1].b = 25;

		c[2].a = 27;
		c[2].b = 40;

		c[3].a = 50;
		c[3].b = 60;

		int maxVal = m.maxChainLength(c, 4);
		System.out.println(maxVal);
	}
}
