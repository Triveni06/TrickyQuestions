package sample1;

public class palidro1 {

	public static void main(String[] args) {
	int sum=0,temp,r;
	int n=535;
	temp=n;
	
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("The number is palindrome");
	else
		System.out.println("The number is not palindrome");
	
	}
	}
