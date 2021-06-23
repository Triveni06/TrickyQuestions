//What will be the output when you divide a number by zero?
package TrickyQuestion;

public class DividedByZero {

	public static void main(String[] args) {
		System.out.println(1.0/0);
		System.out.println(12.33f/0);
		System.out.println(10.34000d/0);
		//System.out.println(0/0); //here 0 is integer so we will get Arithmetic Exception
		//System.out.println(1/0);
		System.out.println(0.0/0.0);
		System.out.println(0.0/0);
		
	}

}
//For integers num/0 only we will get Arithmetic exception 
//For double and floating numbers we will get infinity
//System.out.println(0.0/0.0);------>o/p is NaN(not a number)
//System.out.println(0.0/0);or System.out.println(0/0.0);---->o/p is NaN(not a number)