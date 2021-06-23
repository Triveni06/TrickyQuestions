package TrickyQuestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {
//Different ways to find string length 
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.toCharArray().length);//1.
		System.out.println(str.lastIndexOf(""));//2.
		System.out.println(str.split("").length);//3.
		//4.using regular expressions
		Matcher m=Pattern.compile("$").matcher(str);
		m.find();
		int length=m.end();
		System.out.println(length);
		getLength(str);//5.
		System.out.println(getLength("Triveni"));
		String s1="Selenium";
		getLen(s1);
	}
	public static int getLength(String str)
	{
		int i=0;
		try {
		while(true)
		{
			str.charAt(i);
			i++;
		}
		}
		catch(IndexOutOfBoundsException e)
		{
			return i;
		}
	
		
	}
	public static void getLen(String str)
	{
		String st[] =str.split("");
		int count=0;
		for(String s:st)
		{
			count+=s.toCharArray().length;
		}
		System.out.println(count);
	}
}
