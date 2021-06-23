//QUESTION 2: How can we run a java program without creating the object?
package StaticExamples;
public class SBlockQ2 {
	static {
		System.out.println("static block");
		
	}
	public static void test()
	{
		System.out.println("testing method");
	}
	public static void main(String[] args) {
		
		System.out.println("main method");
		test();
		SBlockQ2.test();//we can use directly or by writing classname --- call the static mehtod
	}
// ANS: no need to create object for static methods and static blocks
}
