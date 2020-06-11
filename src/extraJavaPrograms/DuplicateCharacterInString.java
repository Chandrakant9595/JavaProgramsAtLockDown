package extraJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
	
		DuplicateCharacterInString dcis = new DuplicateCharacterInString();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scanner.next();
		
		dcis.countDupChar(str);
		
		/*System.out.println("String: chandrakant shinde");
		dcis.countDupChar("chandrakant shinde");*/
	}
	
	public void countDupChar(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] chars = str.toCharArray();
		
		for(Character ch:chars){
		      if(map.containsKey(ch)){
		         map.put(ch, map.get(ch)+1);
		      } else {
		         map.put(ch, 1);
		        }
		    }
		
		Set<Character> keys = map.keySet();
		
		for(Character ch:keys){
		      if(map.get(ch) > 1){
		        System.out.println("Char "+ch+" "+map.get(ch));
		      }
		    }
	}
}
