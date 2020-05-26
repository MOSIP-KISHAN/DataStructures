package ds.sort;

public class MergeSort {

	public void merge(int[] left, int[] right, int[] array) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < leftLength) {
			array[k] = left[i];
			i++;
			k++;
		}
		while (j < rightLength) {
			array[k] = right[j];
			j++;
			k++;
		}

	}

	public int[] sort(int[] array) {
		int size = array.length;
		if (size < 2)
			return null;
		int mid = size / 2;
		int left[] = new int[mid];
		int right[] = new int[size - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		for (int i = mid; i < size; i++) {
			right[i-mid] = array[i];
		}

		sort(left);
		sort(right);
		merge(left, right, array);
		return array;
	}

	
}
