//count the occurrence of a character in the string?
//Answers:1.using apache common string utils
//2.using streams jdk 1.8

package TrickyQuestion;

import org.apache.commons.lang3.StringUtils;

public class CharacterOccurance1 {

	public static void main(String[] args) {
		
		String str="Hello World";
		getcharcount(str,"l");
		getcountchar(str,"H");
	}
	//using string utils for count of chars in string..
	public static void getcharcount(String str,String st)
	{
		int count=StringUtils.countMatches(str, st);
		System.out.println(st +":"+ count);
	}
	//by using streams 
	public static void getcountchar(String str,String ch)
	{
		long count=str.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals(ch)).count();
		System.out.println(ch+ ":"+ count);
	}

}
