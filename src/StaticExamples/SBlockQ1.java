
//QUESTION1: Explain static block in java?
package StaticExamples;
//ANS:static blocks will be executed once class loads then only other including main ().
public class SBlockQ1 {
	static 
	{
		System.out.println("static block1");
	}
	static 
	{
		System.out.println("static block2");
	}
	static 
	{
		System.out.println("static block3");
	}
	public static void main(String[] args) {

		System.out.println("Main method");

	}
	static 
	{
		System.out.println("static block4");
	}

}
