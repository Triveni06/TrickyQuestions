package StaticExamples;

public class SBlockQ8II {

	static
	{
		System.out.println("static Block");
	}
	{
		System.out.println("Instance Initializing the Block");
	}
	SBlockQ8II()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new SBlockQ8II();

	}

}
//output: [because here we create the object "new SBlockQ8II();"]
//static Block
//Main Method
//Instance Initializing the Block
//Constructor
//* the high priority in java  is giving to-----
//first instance Initializing block then only constructor 