package mg.sort;

public class InsertionSort {

	private int[] values;

	private void insertionSort() {

		int key;
		int j;
		int n = values.length;

		for (int i = 1; i < n; i++) {
			key = values[i];
			j = i - 1;

			while (j >= 0 && values[j] > key) {
				values[j + 1] = values[j];
				j--;
			}
			values[j + 1] = key;
		}

	}

	public static void main(String[] args) {
		InsertionSort iSort = new InsertionSort();
		iSort.values = new int[] { 6, 5, 4, 3, 9, 2, 0 };
		iSort.insertionSort();

		for (int i = 0; i < iSort.values.length; i++) {
			System.out.print(iSort.values[i] + " \t");
		}
	}
}
