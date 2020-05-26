import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CircularArray extends Demo{
	
	public static void main(String[] args) {
		
		char[] array= {'A','B','C','D','E','F'};
		
		printCircularArray(array, 6, 3);
		
		
	}
	
	// array using extra memory space
	private static void printCircularArray(char[] a, int n, int ind) {
		// Create an auxiliary array  
        // of twice size. 
        char[] b = new char[(2 * n)]; 
  
        // Copy a[] to b[] two times  
        for (int i = 0; i < n; i++)  
            b[i] = b[n + i] = a[i]; 
  
        // print from ind-th index to  
        // (n+i)th index. 
        for (int i = ind; i < n + ind; i++) 
            System.out.print(b[i]+" "); 
    }
		
	
	// array without using extra memory space 
	public static void printCircularArrayOptimize(char[] a,int size,int index) {
		
		for(int i=index;i<size+index;i++) {
			int value=i%size;
			System.out.println(a[(i%size)]);
		}
		
		List<String> list=new ArrayList<String>();
		
		Stream<String> str=list.stream();
		
	}
	

}
