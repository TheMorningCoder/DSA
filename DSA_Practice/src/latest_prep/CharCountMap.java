package latest_prep;

import java.util.HashMap;
import java.util.Map;

public class CharCountMap {
	
	public static void main(String args[]) {
		String str="saumyasinghanuragvittareddy";
		char ch=getMaxOccuredChar(str);
		System.out.println(ch);
	}
	public static char getMaxOccuredChar(String str){
		
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		int max=0;
		char element='-';
		for(char ch:str.toCharArray()) {
			charMap.put(ch,charMap.getOrDefault(ch, 0) +1);
		}
		
		
		for(Map.Entry<Character,Integer> entry: charMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue()>max) {
				max=entry.getValue();
				element=entry.getKey();
			}
		}
		return element;
	}

}
