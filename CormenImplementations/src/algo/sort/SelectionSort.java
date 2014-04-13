package algo.sort;

public class SelectionSort extends Sort {

	public void sort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) { // Cost: c1, times: n
			int replace = unsorted[i]; // Cost: c2, times: n-1
			int index = i; // Cost: c3, times: n-1
			for (int j = i + 1; j < unsorted.length; j++) { // Cost: c4, times:
															// nSigma(i+1) tj
				if (unsorted[j] < replace && (i != j)) { // Cost: c5, times:
															// nSigma(i+1) tj-1
					replace = unsorted[j]; // Cost: c6, times: nSigma(i+1) tj-1
					index = j; // Cost: c7, times: nSigma(i+1) tj-1
				}
			}
			unsorted[index] = unsorted[i]; // Cost: c8, times: n-1
			unsorted[i] = replace; // Cost: c9, times: n-1
		}
	}

	public static void main(String[] args) {

		int[] list = new int[] { 5, 2, 4, 6, 1, 3 };
		SelectionSort ss = new SelectionSort();
		ss.printUnSortedList(list);
		ss.sort(list);
		ss.printUnSortedList(list);
	}

}
