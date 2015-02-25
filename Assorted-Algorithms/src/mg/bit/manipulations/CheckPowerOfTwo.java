package mg.bit.manipulations;

public class CheckPowerOfTwo {

	private boolean isPowerOfTwo(int a) {

		if ((a & (a - 1)) == 0)
			return true;
		return false;

	}

	public static void main(String[] args) {
		CheckPowerOfTwo o = new CheckPowerOfTwo();
		System.out.println(o.isPowerOfTwo(1));
		System.out.println(o.isPowerOfTwo(2));
		System.out.println(o.isPowerOfTwo(3));
		System.out.println(o.isPowerOfTwo(4));
		System.out.println(o.isPowerOfTwo(5));
		System.out.println(o.isPowerOfTwo(6));
		System.out.println(o.isPowerOfTwo(7));
		System.out.println(o.isPowerOfTwo(8));
		System.out.println(o.isPowerOfTwo(9));
		System.out.println(o.isPowerOfTwo(10));
		System.out.println(o.isPowerOfTwo(11));
		System.out.println(o.isPowerOfTwo(12));
		System.out.println(o.isPowerOfTwo(13));
		System.out.println(o.isPowerOfTwo(14));
		System.out.println(o.isPowerOfTwo(15));
		System.out.println(o.isPowerOfTwo(16));

	}

}
