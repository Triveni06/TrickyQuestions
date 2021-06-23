//Print 1 to 100 with out using loop in the code?
//Ans: 1.using Recursive function
//2.java streams ---java 1.8 version
package TrickyQuestion;

import java.util.stream.IntStream;

public class PrintWithOutloop {

	public static void main(String[] args) {
		IntStream.range(1, 101).forEach(e->System.out.println(e));//2.java streams
		printnum(1);
		printnumber(1,100);
	}
	public static void printnum(int num)  //Recursive function---calling the function itself
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printnum(num);
		}
	}
	public static void printnumber(int stnum,int endnum)
	{
		if(stnum<=endnum)
		{
			System.out.println(stnum);
			stnum++;
			printnumber(stnum,endnum);
		}
	}
}
