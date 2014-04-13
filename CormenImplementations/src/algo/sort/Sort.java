package algo.sort;

public abstract class Sort {

	public abstract void sort(int[] unsorted);

	public void printUnSortedList(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "\t");
		}
		System.out.println();

	}

	public void printSortedList(int[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + "\t");
		}
		System.out.println();

	}

}
