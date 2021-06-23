package StaticExamples;

public class SBlockQ8I {

	static
	{
		System.out.println("static Block");
	}
	{
		System.out.println("Initializing the Block");
	}
	SBlockQ8I()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");

	}

}
//Here o/p is : static Block
//Main Method
//because when loading the class itself static block will executed and then main method.
//why it is not printing "Initializing the Block" and "Constructor" along with above o/p?
//Ans: because these both(instance block and constructor) will execute 
//only if we create the object.