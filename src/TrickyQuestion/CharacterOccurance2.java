//count the occurrence of a character in the string?
//Ans: 1.normal loop with charArray
//2.str.length---cahrAt(i)


package TrickyQuestion;
public class CharacterOccurance2 {

	public static void main(String[] args) {
		
		String str="Java Javascript";
		getcounts(str,'t');
		counts(str,'J');
		

	}
	//using tocharArray()
	public static void getcounts(String str,char ch)
	{
		int count=0;
		for(char s:str.toCharArray())
		{
			if(s==ch)
			{
			count++;
			}
		}
		System.out.println(ch+ ":" + count);

	}
	//using normal for loop with str.length()
	public static void counts(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+ ":" + count);
		
		
		
	}	
}