package StaticExamples;

class Test
{
	static
	{
		System.out.println("Test-------static block");
	}
	public static final int x=20;
}
public class SBlockQ7I {

	public static void main(String[] args) {
		System.out.println(Test.x);


	}

}
//here the output is -----20.It is not executing static block.
//this is called "compiler optimization".
//Because the complier will see the variable x is static in nature which is actually 
//in memory allocation in the java memory without loading the class ,Test.x is actually 
//replace with 20.