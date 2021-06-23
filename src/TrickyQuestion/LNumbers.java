//What will be the output when you use Long number with L and without L suffix?
package TrickyQuestion;

public class LNumbers {

	public static void main(String[] args) {
		long var=1000*60*60*24*365;
		long var1=1000*60*60*24*365L;
		System.out.println(var);//1471228928
		System.out.println(var1);//31536000000--- this is correct value 
		//when we use suffix L for long 
		// for long value with out suffix L (that means integer -- max value is 32 bit )
		//so it convert binary and give final answer 1471228928
		//31536000000---36 bit 
	}

}
