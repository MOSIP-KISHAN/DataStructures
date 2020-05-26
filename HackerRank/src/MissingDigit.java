
public class MissingDigit {
	
	public static void main(String[] args) {
		missingDigit("3x+12=46");
	}
	
	
	public static String missingDigit(String str) {
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

}
