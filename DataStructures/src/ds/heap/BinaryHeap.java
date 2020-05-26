package ds.heap;

//Build heap (rearrange array) 
public class BinaryHeap {
	
	// To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
	public int[] heapify(int[] arr, int size,int root) {
		
		int largest=root; // Initialize largest as root
		int left=2*root+1;
		int right=2*root+2;
		
		// If left child is larger than root 
		if(left<size && arr[left]>arr[largest]) {
			largest=left;
		}
		
		// If right child is larger than largest so far
		if(right<size && arr[right]>arr[largest]) {
			largest=right;
		}
		
		// If largest is not root
		if(largest!=root) {
			int swap= arr[root];
			arr[root]=arr[largest];
			arr[largest]=swap;
			
			// Recursively heapify the affected sub-tree
			heapify(arr, size, largest);
		}
		
		return arr;
		
	}

}
