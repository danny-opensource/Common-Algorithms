package mg.sort;

public class InsertionSort {

	private int[] values;

	private void insertionSort() {

		for (int i = 1; i < values.length; i++) {
			int key = values[i];
			int j = i - 1;

			while (j >= 0 && values[j] > key) {
				values[j + 1] = values[j];
				j--;
			}

			values[j + 1] = key;
		}

	}

	public static void main(String[] args) {

		InsertionSort iSort = new InsertionSort();
		iSort.values = new int[] { 10, 43, 1, 23, 98, 100, 50, 11 };
		iSort.insertionSort();

		for (int i = 0; i < iSort.values.length; i++) {
			System.out.print(iSort.values[i] + "  ");
		}

	}
}
