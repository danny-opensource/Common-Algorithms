package mg.bit.manipulations;

/**
 * http://www.programmerinterview.com/index.php/java-questions/bit-manipulation-
 * interview-question/
 * Write a Java method that will return the number of bits that will need to be changed in order to convert an integer, X, 
 * into another integer, Y and vice versa. The method should accept two different integers as input. 
 * For example, if your method is passed the integers 12 and 16 then your method should return a 3
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
