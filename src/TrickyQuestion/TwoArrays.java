package TrickyQuestion;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class TwoArrays {

	public static void main(String[] args) {
		String gradeA[]= {"Triveni","ravi","pandu","sweety"};
		String gradeB[]= {"jerry","cherry","tom"};
		Stream<String> Grade1=Arrays.stream(gradeA);
		Stream<String> Grade2=Arrays.stream(gradeB);
		String Grade[]=Stream.concat(Grade1, Grade2).toArray(x->new String[x]);
		for(String s:Grade)
		{
			System.out.println(s);
		}
		System.out.println("------using Google Guava-------");
		String Result[]=ObjectArrays.concat(gradeA, gradeB,String.class);
		for(String s:Result)
		{
			System.out.println(s);
		}
		int a1[]= {1,2,3,4,5};
		int a2[]= {6,7,8,9,10};
		int a3[]=Ints.concat(a1,a2);
		for(int i:a3)
		{
			System.out.println(i);
		}
	}

}
