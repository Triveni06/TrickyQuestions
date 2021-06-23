package PracticeNaveenPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Count Number of Duplicate Words in Given String
public class CountDuplicateWords {

	public static void main(String[] args) {
		DuplicateWords("java is best java lang is ");
		
	}	
	public static void DuplicateWords(String string)
	{
		
		String st[]=string.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(String e:st)
		{
			if(map.containsKey(e))
			{
				map.put(e, map.get(e)+1);
			}
			else
			{
				map.put(e, 1);
				
			}
		}
		Set<Map.Entry<String,Integer>> setres=map.entrySet();
		for(Entry<String,Integer>res:setres)
		{
			if(res.getValue()>1)
				System.out.println(res.getKey()+":"+ res.getValue());
		}
	
	}
}
