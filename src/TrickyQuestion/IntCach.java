//compare two integer numbers
//integer caching
package TrickyQuestion;
public class IntCach {
//integer caching :num and num1 both are auto boxed and take the actual values 
	//hence == will returns true if and only if the range is between -128 to 127
	//otherwise it will return false that means out of the range.
	public static void main(String[] args) {

		Integer num=120;
		Integer num1=120;
		if(num==num1)
		{
			System.out.println("both are equal");
		}
		else
			System.out.println("both are not  equal");

	}

}
