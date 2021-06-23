//Question3: similarity and different of static block and static method
//Ans:similarity is no need to create object for both static method and static block.
//Difference is static block will be executed while class loading where as static method we 
//have to call explicitly by directly or by classname.

package StaticExamples;

public class SBlockQ3 {

	static {
		System.out.println("static block");
		
	}
	public static void test()
	{
		System.out.println("testing method");
	}
	public static void cover()
	{
		System.out.println("cover method");
		test();
	}
	public static void main(String[] args) {
		
		System.out.println("main method");
		test();
		//SBlockQ2.test();
		cover();
}
}