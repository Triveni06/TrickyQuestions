//string reverse program
package sample1;

public class Str {

	public static void main(String[] args) {
		String str="Triveni";
		System.out.println("The original string" + str);
		char a[]=str.toCharArray();//convert the string in new character array
		String reverse="";
		for(int i=(a.length)-1;i>=0;i--) {
		 reverse=reverse+a[i];
		}
		System.out.println("The Reverse string is  " +reverse);
		

}
}