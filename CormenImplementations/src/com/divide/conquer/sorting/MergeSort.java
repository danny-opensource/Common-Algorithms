package com.divide.conquer.sorting;

public class MergeSort {

	int[] numbers;
	int[] helper;

	private void mergeSort(int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			mergeSort(first, middle);
			mergeSort(middle + 1, last);
			mergeLists(first, middle, last);
		}
	}

	private void mergeLists(int first, int middle, int last) {
		for (int i = first; i <= last; i++) {
			helper[i] = numbers[i];
		}

		int i = first;
		int j = middle + 1;
		int k = first;

		while ((i <= middle) && (j <= last)) {
			if (helper[i] < helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			numbers[k] = helper[i];
			i++;
			k++;
		}
	}

	public static void main(String[] args) {

		int[] num = new int[] { 5, 3, 25, 6, 2, 21, 674, 23 };

		MergeSort ms = new MergeSort();
		ms.numbers = num;
		ms.helper = new int[num.length];

		ms.mergeSort(0, num.length - 1);

		for (int i = 0; i < num.length; i++) {
			System.out.print(ms.numbers[i] + " ");
		}

	}

}
