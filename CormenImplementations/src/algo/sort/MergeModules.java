package algo.sort;

public class MergeModules extends Sort {

	int[] numbers;
	int[] helper;

	@Override
	public void sort(int[] unsorted) {

	}

	private void mergeModule(int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergeModule(low, middle);
			mergeModule(middle + 1, high);
			mergeLists(low, middle, high);
		}
	}

	private void mergeLists(int low, int middle, int high) {

		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while ((i <= middle) && (j <= high)) {
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
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		MergeModules mm = new MergeModules();
		int[] num = new int[] { 6, 5, 4, 2, 3, 1 };
		mm.helper = new int[6];
		mm.numbers = num;
		mm.mergeModule(0, 5);

		for (int i = 0; i < 6; i++) {
			System.out.print(mm.numbers[i] + " ");
		}
	}
}
