package PracticeNaveenPrograms;

import java.util.List;

public class PalidromeString {
	
	public static void main(String[] args) {
		IsPalidrome("Triveni");
		IsPalidrome("teet");
//		IsPalidrome("jaaj");
	}
	public static void IsPalidrome(String s)
	{
		String res="";
		char ch[]=s.toCharArray();
		for(int i=(ch.length)-1;i>=0;i--)
		{
			res=res+ch[i];
		}
		System.out.println(s   + " The reverse String is "+ res);
		if(s.equals(res))
		{
			System.out.println(s + "Is Palidrome ");
		}
		else
			System.out.println(s+ " Is not Palidrome");
	}
	
}
