package mg.sort;

public class QuickSort {

	int[] numbers;
	int number;

	private void sort(int[] values) {
		numbers = values;
		number = values.length;

		quickSort(0, number - 1);
	}

	private void exchange(int i, int j) {
		if (numbers[i] != numbers[j]) {
			numbers[i] = numbers[i] + numbers[j];
			numbers[j] = numbers[i] - numbers[j];
			numbers[i] = numbers[i] - numbers[j];
		}
	}

	private void quickSort(int low, int high) {
		int i = low, j = high, pivot;

		pivot = numbers[low + (high - low) / 2];

		while (i <= j) {
			while (numbers[i] < pivot)
				i++;
			while (numbers[j] > pivot)
				j--;

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}

		if (low < j) {
			quickSort(low, j);
		}

		if (i < high) {
			quickSort(i, high);
		}
	}

	public static void main(String[] args) {
		QuickSort qSort = new QuickSort();
		int[] val = { 7, 6, 5, 4, 3, 2 };
		qSort.sort(val);

		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + "\t");
		}
	}
}
