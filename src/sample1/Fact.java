package sample1;

public class Fact {

	public static void main(String[] args) {
		int fact=1;
		int number=5;
		for(int i=1;i<5;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial value of " +  number +" is " + fact);
	}
}
