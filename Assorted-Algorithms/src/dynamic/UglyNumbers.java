package dynamic;

public class UglyNumbers {

	int[] ugly;

	private int getNextUglyNumber(int n) {

		int num2, num3, num5;

		ugly = new int[n];
		int ptr2, ptr3, ptr5;
		ugly[0] = 1;

		ptr2 = ptr3 = ptr5 = 0;

		for (int i = 1; i < n; i++) {
			num2 = ugly[ptr2] * 2;
			num3 = ugly[ptr3] * 3;
			num5 = ugly[ptr5] * 5;

			ugly[i] = Math.min(Math.min(num2, num3), num5);

			if (ugly[i] == num2)
				ptr2++;
			if (ugly[i] == num3)
				ptr3++;
			if (ugly[i] == num5)
				ptr5++;

		}

		return ugly[n - 1];

	}

	public static void main(String[] args) {
		UglyNumbers num = new UglyNumbers();
		int ugly = num.getNextUglyNumber(90);
		System.out.println(ugly);
	}

}
