package mg.bit.manipulations;

public class AddTwoBinary {

	private int[] binaryAdd(int binary1, int binary2) {

		int[] sum = new int[8];
		int carry = 0;
		int i = 0;

		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = ((binary1 % 10) + (binary2 % 10) + carry) % 2;
			carry = ((binary1 % 10) + (binary2 % 10) + carry) / 2;
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}

		if (carry != 0) {
			sum[i++] = carry;
		}

		return sum;

	}

	public static void main(String[] args) {
		AddTwoBinary add = new AddTwoBinary();
		int binary1 = 1100011;
		int binary2 = 1101;

		int[] result = add.binaryAdd(binary1, binary2);

		for (int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i]);
		}
	}
}
