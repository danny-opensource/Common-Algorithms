package mg.dynamic;

public class EggDrop {

	private int eggDrop(int n, int k) {
		if (k == 0 || k == 1)
			return k;

		if (n == 1)
			return k;

		int res, min = Integer.MAX_VALUE;
		for (int i = 1; i <= k; i++) {
			res = Math.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
			if (res < min) {
				min = res;
			}
		}
		return min + 1;
	}

	public static void main(String[] args) {
		EggDrop ed = new EggDrop();
		int result = ed.eggDrop(2, 10);
		System.out.println(result);
	}

}
