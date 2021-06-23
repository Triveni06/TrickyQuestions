package TrickyQuestion;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(":", "[", "]");
		joiner.add("Tom").add("Jerry").add("videos");
		System.out.println(joiner);
		
		
	}

}
