//Question 5: is it possible to compile or run java program without main()?
//Yes , by using static block. from outside of class[TestingBlock] once class load 
//or creating the object we can access static block and we can access static variables too.

package StaticExamples;

public class SBlockQ5 {
	static int age =45;
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
	
}
