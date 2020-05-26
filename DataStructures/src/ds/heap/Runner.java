package ds.heap;

public class Runner {

	public static void main(String[] args) {
		int[] arr = { 4, 10, 3, 5, 1, 15 };
		int[] sorted = new HeapSort().sort(arr);
		print(sorted);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
