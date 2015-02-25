package mg.heaps;

import java.util.LinkedList;
import java.util.List;

public class MaxHeap_Old {

	List<Integer> heap = new LinkedList<Integer>();

	public MaxHeap_Old(int[] values) {
		for (int i = 0; i < values.length; i++) {
			add(values[i]);
		}
	}

	private void add(int value) {

		heap.add(null);
		int k = heap.size() - 1;
		while (k > 0) {
			int parent = (k - 1) / 2;

			int parentValue = heap.get(parent);
			if (value <= parentValue)
				break;
			heap.set(k, parentValue);
			k = parent;
		}
		heap.set(k, value);
	}

	private void percolateUp(int k, int value) {
		if (heap.isEmpty())
			return;

		while (k < (heap.size() / 2)) {
			int leftChild = 2 * k + 1;

		}

	}

	private void remove() {
		int removeNode = heap.get(0);
		int lastNode = heap.remove(heap.size() - 1);
		percolateUp(0, lastNode);
		System.out.println(removeNode);
	}

	public static void main(String[] args) {

	}

}