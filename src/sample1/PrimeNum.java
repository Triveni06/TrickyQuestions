package sample1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNum {

	public static void main(String[] args) {
		long count=Stream.iterate(0, n->n+1).limit(10).filter(PrimeNum::isprime)
		.peek(System.out::println).count();
		
System.out.println("the count is "+count);
	}
	public static boolean isprime(int num)
	{
		if(num<=1) return false;
		return !IntStream.range(2, num/2).anyMatch(x->num%x==0);
	}

}
