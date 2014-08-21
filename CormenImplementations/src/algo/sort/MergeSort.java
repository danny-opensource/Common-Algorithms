package algo.sort;

public class MergeSort extends Sort {

	private int[] numbers;
	private int[] helper;

	@Override
	public void sort(int[] unsorted) {
		// TODO Auto-generated method stub

	}

	private void mergeSort(int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(start, middle);
			mergeSort(middle + 1, end);
			mergeLists(start, middle, end);
		}
	}

	private void mergeLists(int start, int middle, int end) {
		for (int i = start; i <= end; i++) {
			helper[i] = numbers[i];
		}

		int i = start;
		int j = middle + 1;
		int k = start;

		while ((i <= middle) && (j <= end)) {
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
		MergeSort ms = new MergeSort();
		int[] num = new int[] { 4, 3, 6, 7, 5 };
		ms.numbers = num;
		ms.helper = new int[5];
		ms.mergeSort(0, 4);

		for (int i = 0; i < 5; i++) {
			System.out.print(ms.numbers[i] + " ");
		}
	}

}
