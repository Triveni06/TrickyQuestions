package PracticeNaveenPrograms;
//prime number means divided by itself and 1 like 2,3,5,7
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(IsPrime(5));
		System.out.println(IsPrime(7));
		System.out.println(IsPrime(11));

	}

	public static boolean IsPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0)
				return false;
		}
		return true;

	}

}
