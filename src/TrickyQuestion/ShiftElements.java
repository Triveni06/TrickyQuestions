package TrickyQuestion;

import java.util.Arrays;

public class ShiftElements {
	public static int[] rightShiftElement(int[] a)
	{
		if(a.length==1)
		{
			return a;
		}
		int count=0;
		int newArray[]=new int[a.length];
		for(int num:a)
		{
			if(num!=0)
			{
				newArray[count]=num;
				count++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int i[]= {1,2,0,0,3,0,0,0};
		System.out.println(Arrays.toString(rightShiftElement(i)));
		int j[]= {1,0,0,0,3,0,2,0};
		System.out.println(Arrays.toString(rightShiftElement(j)));

	}
	

}
