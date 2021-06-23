package StaticExamples;

class Test1
{
	static
	{
		System.out.println("Test-------static block");
	}
	public final int x=20;
}
public class SBlockQ7II {

	public static void main(String[] args) {
		System.out.println(new Test1().x);


	}

}
         
//because we remove "static" in "public final int x=20;"then we will get the above o/p...
//output is: Test-------static block
//20