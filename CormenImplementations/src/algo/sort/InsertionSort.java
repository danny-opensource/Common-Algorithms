package algo.sort;

public class InsertionSort extends Sort {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] list = new int[] { 5, 2, 4, 6, 1, 3 };
		is.printUnSortedList(list);
		is.sort(list);
		is.printSortedList(list);

	}

	public void sort(final int[] list) {
		for (int j = 1; j < list.length; j++) {
			int key = list[j];
			int i = j - 1;
			while (i > 0 && list[i] > key) {
				list[i + 1] = list[i];
				i--;
			}
			list[i + 1] = key;
		}

	}

}
