package PracticeNaveenPrograms;
//ArmstrongNumber --- 371 = 3*3*3+7*7*7+1*1*1 =will come same as given number
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Armstrong(371);
		Armstrong(370);
		Armstrong(372);
	}
	public static void Armstrong(int num)
	{
		int r=0;
		int cube=0;
		int t;
		t=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if(t==cube) {
			System.out.println(t + "Armstrong number");
		}else
		{
			System.out.println(t+  " not Armstrong number");
		}
		
	}

}
