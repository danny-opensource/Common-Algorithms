package mg.search;

public class BinarySearch {

	private int binarySearch(int[] arr, int l, int r, int x) {
		if (l <= r) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			}
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] val = new int[] { 4, 5, 6, 7, 8, 10, 100, 999 };
		int found = bs.binarySearch(val, 0, val.length - 1, 999);
		System.out.println(found);

	}
}