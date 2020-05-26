import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PractHack {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//        
//        
//        Locale usLocale=new Locale("en", "US");
//        Locale indiaLocale=new Locale("en", "IN");
//        Locale chLocale=Locale.CHINA;
//        Locale frLocale=Locale.FRANCE;
//        NumberFormat us=NumberFormat.getCurrencyInstance(usLocale);
//        NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
//        NumberFormat china=NumberFormat.getCurrencyInstance(chLocale);
//        NumberFormat france=NumberFormat.getCurrencyInstance(frLocale);
//        
//        System.out.println("US: " + us.format(payment));
//        System.out.println("India: Rs. " + india.format(payment));
//        System.out.println("China: " + china.format(payment));
//        System.out.println("France: " + france.format(payment));
        /*PractHack p=new PractHack();
        System.out.println("Factorial of given no is :"+p.factorial(6));
        System.out.println("Reverse of string is :"+p.reverse("Kishan"));
        Integer al[]= {1,2,3,4,5,4,5,6,7,8,9};
        System.out.println("Remove dups of list :"+p.removeDups(al));
        System.out.println("Reapecting char :"+p.repeatingChar("kishann"));*/
       
		//MissingDigit("3x+12=46");
	/*	String string ="abb";
		printPermutn(string, "");
        */
		
		
		//System.out.println(demo.equals(demo2));

	}
	static void printPermutn(String str, String ans) 
    { 
		if(str.length()==0) {
			System.out.print(ans+"\n");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		String ros= str.substring(0, i)+str.substring(i+1);
		printPermutn(ros, ans+ch);
		}
    }
	public static String MissingDigit(String str) {
	    // code goes here  
	    String[] arr=str.split(" ");
	     int[] num=new int[2]; int j=0;
	     String string=null;int temp=0;
	    for(int i=0;i<arr.length;i++){
	     if(isNumber(arr[i])){
	       num[j]=Integer.parseInt(arr[i]);
	       j++;
	     }
	     if(!arr[i].equals("+")||!arr[i].equals("-")||!arr[i].equals("*")||!arr[i].equals("/")||!arr[i].equals("=")){
	       string=arr[i];
	     }
	    }
	    if(arr[1].equals("+")){
	      temp=num[0]+num[1];
	    }
	    else if(arr[1].equals("-")){
	      temp=num[0]-num[1];
	    }
	    else if(arr[1].equals("*")){
	      temp=num[0]*num[1];
	    }
	    else if(arr[1].equals("/")){
	      temp=num[0]/num[1];
	    }
	    String str2=""+temp;
	    int position=0;
	    for(int i=0;i<string.length();i++){
	      if(string.charAt(i)=='x'){
	        position=i;break;
	      }
	    }
	    
	    
	    return ""+str2.charAt(position);
	  }
	static boolean isNumber(String str){
	      if(str==null) return false;
	      try{
	        int a=Integer.parseInt(str);
	      }
	      catch(Exception e){
	        return false;
	      }
	      return true;
	    }
	
	public int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public List<Integer> removeDups(Integer a[]){
		List<Integer> newList=Arrays.asList(a);
		Set<Integer> temp=new HashSet<>(newList);
		return new  ArrayList<Integer>(temp);
	}
	public String reverse(String str){
		if(str==null||str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
	}
	
	public Character repeatingChar(String str) {
		Map<Character, Integer> temp=new HashMap<>();
		for(char c:str.toCharArray()) {
			temp.put(c, temp.containsKey(c) ? temp.get(c)+1:1);
		}
		
		for(Entry<Character, Integer> entry: temp.entrySet()) {
			if(entry.getValue()>1) {
				return entry.getKey();
			}
		}
		
		return 0;
	}


}
