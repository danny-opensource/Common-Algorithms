package mg.sort;

public class SelectionSort {
	private int[] values;

	private void swap(int i, int minIndex) {

		System.out.println(" Before: (i,minIndex) : " + values[i] + ".."
				+ values[minIndex]);
		values[i] = values[i] + values[minIndex];
		values[minIndex] = values[i] - values[minIndex];
		values[i] = values[i] - values[minIndex];
		System.out.println(" Before: (i,minIndex) : " + values[i] + ".."
				+ values[minIndex]);
	}

	private void selectionSort() {

		for (int i = 0; i < values.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < values.length; j++) {
				if (values[j] < values[minIndex]) {
					minIndex = j;
				}
			}

			if (values[i] != values[minIndex])
				swap(i, minIndex);
		}

	}

	public static void main(String[] args) {

		SelectionSort sSort = new SelectionSort();
		sSort.values = new int[] { 10, 43, 1, 23, 98, 100, 50, 11 };
		sSort.selectionSort();

		for (int i = 0; i < sSort.values.length; i++) {
			System.out.print(sSort.values[i] + "  ");
		}

	}
}