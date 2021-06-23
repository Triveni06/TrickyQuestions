//Find Duplicate elements in array?
//1.brute force(normal for loop)
//2.Hash set

package TrickyQuestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		String a[]= {"Amazon","GCP","Java","SauceLabs","GCP","Java","Amazon"};
		System.out.println(a.length);//6
		System.out.println("************Brute force ********************");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
					System.out.println(a[i]);
			}
		}
		System.out.println("***************Hash set*************");
		Set<String> data=new HashSet<>();
		for(String e:a)
		{
			if(data.add(e)==false)//if the element already present in the set it returns false
				System.out.println(e);
			
		}
		
		
	}

}
