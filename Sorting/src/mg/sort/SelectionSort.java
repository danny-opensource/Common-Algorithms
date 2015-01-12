package mg.sort;

public class SelectionSort {

	int[] values;

	private void swap(int i, int j) {
		if (values[i] != values[j]) {
			values[i] = values[i] + values[j];
			values[j] = values[i] - values[j];
			values[i] = values[i] - values[j];
		}
	}

	private void selectionSort() {
		int maxIndex = 0;

		for (int i = 0; i < values.length; i++) {
			maxIndex = i;

			for (int j = i + 1; j < values.length; j++) {
				if (values[j] < values[maxIndex]) {
					maxIndex = j;
				}
			}
			swap(i, maxIndex);
		}
	}

	public static void main(String[] args) {
		SelectionSort sSort = new SelectionSort();
		sSort.values = new int[] { 6, 5, 4, 3, 2, 9, 1 };
		sSort.selectionSort();

		for (int i = 0; i < sSort.values.length; i++) {
			System.out.print(sSort.values[i]);
		}
	}

}
