package dynamic;

public class Fibonacci {

	int lookup[];

	public Fibonacci() {
		lookup = new int[100];
		for (int i = 0; i < 100; i++) {
			lookup[i] = Integer.MIN_VALUE;
		}
	}

	private int fib(int n) {

		if (lookup[n] == Integer.MIN_VALUE) {
			if (n <= 1) {
				lookup[n] = n;
			} else {
				lookup[n] = fib(n - 1) + fib(n - 2);
			}

		}

		return lookup[n];

	}

}
