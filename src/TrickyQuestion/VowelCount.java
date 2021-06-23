package TrickyQuestion;

import java.util.function.IntPredicate;
import java.util.stream.Stream;

import com.google.common.base.CharMatcher;

public class VowelCount {

	public static void main(String[] args) {
		System.out.println("-------------using Google Guava----------");
		String st="google";
		int Vcount=CharMatcher.anyOf("aeiou").countIn(st);
		System.out.println(Vcount);
		System.out.println("-------------using Stream java 8----------");
		String str="testingAUI";
		IntPredicate vowel=new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
						t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
			}
		};
		long scount=str.chars().filter(vowel).count();
		System.out.println(scount);
		System.out.println("-------using java----------");
		String jst="aeiouAEIOU";
		int jcount=0;
		for(int i=0;i<jst.length();i++)
		{
			if(isVowel(jst.charAt(i)))
			{
			jcount++;
			}
		}
		System.out.println(jst +" has " + jcount + " vowels");
}
	public static boolean isVowel(char t)
	{
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
				t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}
}