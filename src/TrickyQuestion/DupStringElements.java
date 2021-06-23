//How to print duplicate characters in string?




package TrickyQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupStringElements {

	public static void main(String[] args) {
		String st="tesla";
		DuplicateElements(st);
		
	}
	public static void DuplicateElements(String str)
	{
		if(str==null)
		{
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("Empty string ");
			return;
		}
		if(str.length()==1)
		{
			System.out.println("Single char String ");
			return;
		}
		char ch[]=str.toCharArray();
		Map<Character,Integer> charmap=new HashMap<>();
		for(Character e:ch)
		{
			if(charmap.containsKey(e))
			{
				charmap.put(e, charmap.get(e)+1);
			}
			else
			{
				charmap.put(e, 1);
			}
			
		}
		Set<Map.Entry<Character, Integer>> entry=charmap.entrySet();
		for(Map.Entry<Character,Integer> entryset:entry)
		{
		if(entryset.getValue()>1) {
			System.out.println(entryset.getKey()+ ":"+ entryset.getValue());
		}
			else
				//System.out.println(entryset.getKey()+ ":"+ entryset.getValue());
				System.out.println(entryset.getKey()  + "  is not  repeated");
		
		}
		

		
	}

}
