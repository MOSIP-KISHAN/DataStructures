package ds.sort;

import java.util.Random;

public class QuickSort {
	
	public int[] sort(int array[],int start,int end) {
		if(start<end) {
			int pIndex=partition(array,start,end);
			sort(array,start,pIndex-1);
			sort(array,pIndex+1,end);
		}
		return array;
	}
	private int randomizedPartition(int[] array,int start,int end) {
		int rand=new Random().nextInt(array.length);
		int swap=array[rand];
		array[rand]=array[end];
		array[end]=swap;
		
		return partition(array, start, end);
	}
	
	private int partition(int[] array,int start,int end) {
		
		int pivot=array[end];
		int pIndex=start;
		for(int i=start;i<end;i++) {
			if(array[i]<=pivot) {
				int swap=array[i];
				array[i]=array[pIndex];
				array[pIndex]=swap;
				pIndex++;
			}
		}
		int temp=array[pIndex];
		array[pIndex]=array[end];
		array[end]=temp;
		
		return pIndex;
	}

}
