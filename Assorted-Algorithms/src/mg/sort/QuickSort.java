package mg.sort;

public class QuickSort {
	int[] numbers;
	int number;

	private void sort(int[] values) {
		if (null == values || values.length == 0)
			return;

		numbers = values;
		number = values.length;

		quickSort(0, number - 1);
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

	private void exchange(int i, int j) {
		if (numbers[i] != numbers[j]) {
			numbers[i] = numbers[i] + numbers[j];
			numbers[j] = numbers[i] - numbers[j];
			numbers[i] = numbers[i] - numbers[j];
		}
	}

	public static void main(String[] args) {
		QuickSort qSort = new QuickSort();
		int[] values = { 7, 6, 5, 4, 3, 2, 1 };
		qSort.sort(values);

		for (int i = 0; i < qSort.numbers.length; i++) {
			System.out.print(qSort.numbers[i] + "\t");
		}
	}

}