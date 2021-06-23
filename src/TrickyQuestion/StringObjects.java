//How many String objects will be created ?- string object and string constant pool 
//here objects are created 3
package TrickyQuestion;
public class StringObjects {

	public static void main(String[] args) {
		String s1="Hello world";
		 String s2="Hello world";
		 String s3=s1;
		String n1=new  String ("Hello world");
		String n2=new  String ("Hello world");
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//true
		System.out.println(s1==s3);//true
		System.out.println(n1==n2);//false
		System.out.println(n1==s2);//false 
	}

}
//In the above example the 3 objects are created one is in heap pointing to n1(in stack memory)
//one is in heap pointing to n2 (in stack memory),one is in string constant pool .
// the references are stored in the stack memory.