package TrickyQuestion;

import java.util.Arrays;

public class Print1To100 {

	public static void main(String[] args) {
		System.out.println("printing the values with out using loop and recursion..");
		Object num[]=new Object[100];
		Arrays.fill(num, new Object() {
			int count=0;
			@Override
			public String toString()
			{
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
	}

}
