package com.divide.conquer.sorting;

public class QuickSort {

	int numbers[];
	private int number;

	private void quickSort(int low, int high) {
		int i = low;
		int j = high;

		int pivot = numbers[low + (high - low) / 2];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}

			while (numbers[j] > pivot) {
				j--;
			}

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
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void main(String[] args) {
		int num[] = new int[] { 4265, 42525, 4, 3, 242, 12, 1, 5 };
		QuickSort qs = new QuickSort();
		qs.numbers = num;
		qs.quickSort(0, num.length - 1);

		for (int i = 0; i < num.length; i++) {
			System.out.print(qs.numbers[i] + "  ");
		}
	}
}
