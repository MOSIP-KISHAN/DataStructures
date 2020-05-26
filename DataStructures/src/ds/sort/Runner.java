package ds.sort;

public class Runner {
	
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int arr2[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort mergeSort = new MergeSort();
		int[] mergeSorted=mergeSort.sort(arr);
		
		QuickSort quickSort=new QuickSort();
		int[] quickSorted=quickSort.sort(arr2, 0, arr2.length-1);

		System.out.println("\nMerge Sorted array");
		printArray(mergeSorted);
		
		System.out.println("\nQuick Sorted array");
		printArray(quickSorted);
	}
	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
