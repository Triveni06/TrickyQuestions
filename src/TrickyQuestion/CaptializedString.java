package TrickyQuestion;

public class CaptializedString {

	public static void main(String[] args) {
		String str = "TriveniSeleniumPraticeJava";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				count++;
		}
		System.out.println(count);
		System.out.println("using streams......");
		long count1 = str.chars().filter(e -> e >= 'A' && e <= 'Z').count();
		System.out.println(count1);

	}

}
