package PracticeNaveenPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		countCharacters("I love coding java java");
		countCharacters("java");
	}
	public static void countCharacters(String str)
	{
		if(str==null)
			System.out.println("Null String");
		if(str.isEmpty())
			System.out.println("Empty String");
		if(str.length()==1)
			System.out.println("Single char string");
		char ch[]=str.toCharArray();
		Map<Character,Integer> words=new HashMap<>();
		for(Character c:ch)
		{
			if(words.containsKey(c))
			{
				words.put(c, words.get(c)+1);
			}
			else
			{
				words.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> wordset=words.entrySet();
		for(Entry<Character,Integer> wor:wordset)
		{
			if(wor.getValue()>1)
				System.out.println(wor.getKey()+":"+ wor.getValue());
		}
		
	}

}
