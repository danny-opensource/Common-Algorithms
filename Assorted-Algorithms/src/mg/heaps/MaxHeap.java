package mg.heaps;

public class MaxHeap {
	int[] heap;
	int size;
	int maxSize;

	private static final int FRONT = 1;

	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;

		size = 0;

		heap = new int[maxSize + 1];
		heap[0] = Integer.MAX_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private void swap(int i, int j) {
		if (heap[i] != heap[j]) {
			heap[i] = heap[i] + heap[j];
			heap[j] = heap[i] - heap[j];
			heap[i] = heap[i] - heap[j];
		}
	}

	private void insert(int element) {
		heap[++size] = element;
		int current = size;

		while (heap[current] > heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	private int leftChild(int pos) {
		return 2 * pos;
	}

	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size)
			return true;
		return false;
	}

	private void maxHeapify(int pos) {
		if (!isLeaf(pos)) {
			if ((heap[pos] < heap[leftChild(pos)])
					|| heap[pos] < heap[rightChild(pos)]) {
				if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					maxHeapify(leftChild(pos));
				}

				else {
					swap(pos, rightChild(pos));
					maxHeapify(rightChild(pos));
				}
			}
		}
	}

	private void maxHeap() {
		for (int pos = size / 2; pos >= 1; pos--) {
			maxHeapify(pos);
		}
	}

	private int remove() {
		int popped = heap[FRONT];
		heap[FRONT] = heap[size--];
		maxHeapify(FRONT);
		return popped;
	}

	public static void main(String[] args) {
		MaxHeap maxHeap = new MaxHeap(15);
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);
		maxHeap.maxHeap();

		System.out.println(maxHeap.remove());
	}
}