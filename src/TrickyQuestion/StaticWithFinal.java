//Will static block be executed with final variable?
//Ans: No static block will not executed with final variable.
//once final is removed from the line 16 then it will execute the static block.
package TrickyQuestion;

public class StaticWithFinal {

	public static void main(String[] args) {
		System.out.println(Test.x);

	}

}
class Test
{
	public static final int x=100;
	static
	{
		System.out.println("static block in test class ");
	}
}
