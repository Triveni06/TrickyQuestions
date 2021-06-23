//What is the MIN_value of double and float in java?
//What is value of double min_value?

package TrickyQuestion;
public class FloatAndDouble {

	public static void main(String[] args) {
		//for integer and long we will get min value is -ve number 
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Long.MIN_VALUE);//-9223372036854775808
		
		
		//for double and float we will get min value is +ve number
		System.out.println(Double.MIN_VALUE);//4.9E-324
		System.out.println(Float.MIN_VALUE);//1.4E-45
		
		// which one is bigger--> double min_value or 0.0d?
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));//0.0
		 
		System.out.println(Math.min(Float.MIN_VALUE,0.0f));//0.0
		
		System.out.println(Math.min(Integer.MIN_VALUE,0.0d));//- ve value
		
		//which one is bigger --> double min_value or negative infinity
		System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY));//- Infinity
		System.out.println(Math.min(Double.MIN_VALUE,Float.NEGATIVE_INFINITY));//- Infinity
	}

}
