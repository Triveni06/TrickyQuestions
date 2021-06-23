//Pass null argument with method overloading of string and object types?
//Object is the super class of string 
package TrickyQuestion;
public class MO {

	public static void main(String[] args) {
		
		test(null);

	}
	public static void test(String  s)
	{
		System.out.println("String Argument");
	}
	public static void test(Object o)
	{
		System.out.println("object  Argument");
	}
	

}
//o/p is "String Argument" because compile will check most frequency data type is string 