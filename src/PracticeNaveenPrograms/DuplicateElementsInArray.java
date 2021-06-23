package PracticeNaveenPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String st[] = { "Amazon", "Test", "Amazon", "Test", "java" };
		getDuplicate(st);
	}

	public static void getDuplicate(String str[]) {
		Set<String> data = new HashSet<>();
		Set<String> Result = Arrays.asList(str)
				.stream().filter(e -> !data.add(e)).collect(Collectors.toSet());

		System.out.println(Result);

	}

}
