package latest_prep;

import java.util.HashMap;
import java.util.Map;

public class CharMap {
	public static void main(String[] args) {
		String str="111aaaassssssssddddfff";
		System.out.println(str);
		char ch=getMaximumOccurredChar(str);
		System.out.println("The character that has occurred the most is: "+ch);
	}
	public static char getMaximumOccurredChar(String str) {
		char ch='-';
		
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		
		for( char c: str.toCharArray()) {
			int value= charMap.getOrDefault(c, 0);
			charMap.put(c,value+1 );
		}
		//Map.Entry<Character, Integer> entry;
		int max=0;
		
		for(Map.Entry<Character, Integer> entry: charMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue()>max) {
				max=entry.getValue();
				ch=entry.getKey();
			}
		}
			
		return ch;
	}
}
