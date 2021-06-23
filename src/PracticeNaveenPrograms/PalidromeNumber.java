package PracticeNaveenPrograms;

// the reverse of the number is same of the number i..e 151 is same as 151 this is 
//PalidromeNumber.
public class PalidromeNumber {

	public static void main(String[] args) {
		Palidrome(152);
		Palidrome(151);
		Palidrome(78987);
		Palidrome(1);
	}

	public static void Palidrome(int num) {
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			sum = sum*10+r;
			num = num / 10;
		}
		if (t == sum)
			System.out.println(t +" is palidrome....");
		else
			System.out.println(t + " is not palidrome....");

	}

}
