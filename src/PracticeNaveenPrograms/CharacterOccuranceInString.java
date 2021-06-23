package PracticeNaveenPrograms;

import org.apache.commons.lang3.StringUtils;

public class CharacterOccuranceInString {

	public static void main(String[] args) {
		
		//count("java","a");
		countStreams("i love coding ","i");
		
	
	}
	public static void count(String str,String val) {
		
		int count=StringUtils.countMatches(str, val);
		System.out.println(val +  ":" + count);
	}
	public static void countStreams(String str,String val)
	{
		long count=str.chars().mapToObj(e->String.valueOf((char)e))
		.filter(e->e.equals(val)).count();
		System.out.println(val + ":" + count);
	}

}
