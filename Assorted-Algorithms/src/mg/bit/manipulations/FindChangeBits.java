package mg.bit.manipulations;

/**
 * http://www.programmerinterview.com/index.php/java-questions/bit-manipulation-
 * interview-question/
 * 
 *
 */
public class FindChangeBits {

	private int findChangeBits(int i, int j) {
		int z = i ^ j;

		int bitCount = 0;
		while (z != 0) {
			bitCount += z & 1;
			System.out.println(bitCount);
			z = z >> 1;
		}

		return bitCount;
	}

	public static void main(String[] args) {
		FindChangeBits o = new FindChangeBits();
		System.out.println(o.findChangeBits(12, 16));
	}

}
