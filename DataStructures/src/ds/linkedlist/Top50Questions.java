package ds.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Top50Questions {
	
	public static void main(String[] args) {
		
		/*Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		
		Top50Questions q=new Top50Questions();
		System.out.println("Char is "+q.nonRepeatingNo(str));
		
		
		s.close();*/
		
	}
	
	public char nonRepeatingNo(String str) {
		Map<Character, Integer> count=new HashMap<>();
		for(char c:str.toCharArray()) {
			count.put(c, count.containsKey(c) ? count.get(c)+1:1);
		}
		
		for(Entry<Character, Integer> entry:count.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return 0;
	}

}
