package TrickyQuestion;
import java.util.Arrays;
import java.util.OptionalDouble;
import com.google.common.math.Stats;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5,5,4,3,5};
		int total=0;
		for(int e:num)
		{
			total=total+e;
		}
		System.out.println(total);
		System.out.println(num.length);
		System.out.println(total/num.length);
		System.out.println("------using java streams--------");
		OptionalDouble avg=Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
		System.out.println("------using Google Guava --------");
		double d=Stats.meanOf(num);
		System.out.println(d);
	}

}
