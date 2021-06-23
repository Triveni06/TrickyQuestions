//Question 6: can we initialize member variables with in static block?
//Answer: yes we can initialize  by creating the object.
//* From  static  to static we can access directly.
//*From instant to static we can access by creating object .

package StaticExamples;

public class SBlockQ6 {

	String name;
	static int age;
	static 
	{
		SBlockQ6 e1=new SBlockQ6();
		e1.name="Triveni";
		age=38;
		System.out.println(e1.name+" " + age);
		
	}
	public static void main(String[] args) {
		

	}

}
