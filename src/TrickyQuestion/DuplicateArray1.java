//Find Duplicate elements in array?
//3.Hash map<k,v>
//Java Streams
package TrickyQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateArray1 {

	public static void main(String[] args) {
		String a[]= {"Amazon","GCP","Java","SauceLabs","GCP","Java","Amazon"};
		System.out.println("******************Hash map**************");
		Map<String,Integer> amap=new HashMap<>();
		for(String e:a)
		{
			Integer count=amap.get(e);
			if(count==null)
			{
				amap.put(e, 1);
			}
			else
			{
				amap.put(e, ++count);
			}
		}
		System.out.println(amap);//{Java=2, SauceLabs=1, GCP=2, Amazon=2}
		//print the duplicate elements from the amap
		Set<Entry<String,Integer>> entrys=amap.entrySet();
		for(Entry<String,Integer>Entry:entrys)
		{
			//System.out.println(Entry.getKey()+  "  "+ Entry.getValue());
			if(Entry.getValue()>1)
				System.out.println(Entry.getKey());
		}
		
		System.out.println("*****************Streams set filter****************");
		Set<String> data=new HashSet<>();
		Set<String> Result=Arrays.asList(a).stream().filter(e->!data.add(e)).collect(Collectors.toSet());
		System.out.println(Result);
		System.out.println("*****************Streams grouping by ****************");
		Set<String> eleset=Arrays.asList(a)
				.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		System.out.println(eleset);
		System.out.println("stream using frequency");
		List<String> list=Arrays.asList(a);
		Set<String> elist=list.stream()
				.filter(e->Collections.frequency(list,e)>1)
				.collect(Collectors.toSet());
		System.out.println(elist);
	}

}
