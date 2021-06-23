//Question 4: How can we create object if we make constructor private?
package StaticExamples;

public class SBlockQ4 {
	
	int age;
	private SBlockQ4()
	{
		age=30;
	}
	public static int createobj()
	{
		SBlockQ4 obj1=new SBlockQ4();
		obj1.age=40;
		return obj1.age;
	}
	public static void main(String[] args) {
		SBlockQ4 obj=new SBlockQ4();
		System.out.println(obj.age);

	}

}
//Answer: if the constructor is private within the class we can create the object.But where 
// as outside the class we can not create object so in this case we can do -----
//by using static block or static method .Now we can access without creating object from 
//outside of the class.