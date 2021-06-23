
//What is NaN ?
package TrickyQuestion;
public class NotaNum {

	public static void main(String[] args) {
			System.out.println(0.0/0);//NaN
			System.out.println(Math.sqrt(-1));//NaN
			System.out.println(Float.NaN);//NaN
			System.out.println(2.1%0);//NaN
			double nan=2.1%0;
			System.out.println(Float.NaN==Float.NaN);//false
			System.out.println((2.1%0)==nan);//o/p: false because we can not compare two NaN
			System.out.println(nan==nan);//o/p is false

	}

}
//NaN is Not a Number-----not defined for the square root of -1 and floating number with zero 
//  and also 0.0/0.0 we will get NaN
// we can not  compare two NaN because NaN is not defined 