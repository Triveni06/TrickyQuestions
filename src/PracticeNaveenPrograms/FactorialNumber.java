package PracticeNaveenPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		
		factorial(2);
		factorial(5);
		factorial(8);
	}


public static void factorial(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial value of"+ num  + "is :"+ fact);
}
}