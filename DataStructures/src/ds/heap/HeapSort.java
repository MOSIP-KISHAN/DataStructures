package ds.heap;

public class HeapSort {
	
	public int[] sort(int[] arr) {
		
		int size=arr.length;
		int[] heapArray = new int[size];
		//parent=child/2
		for(int i=size/2-1;i>=0;i--) {
			 heapArray=new BinaryHeap().heapify(arr, size, i);
		}
		
		// One by one extract an element from heap 
		for(int i=size-1;i>0;i--) {
			// Swaping root to the last element
			int swap=heapArray[0];
			heapArray[0]=heapArray[i];
			heapArray[i]=swap;
			
			// call max heapify on the reduced heap
			heapArray=new BinaryHeap().heapify(heapArray, i, 0);
			
		}
		return heapArray;
	}

}
