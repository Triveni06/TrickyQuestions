package TrickyQuestion;

//Find out the missing number in an integer array?
//n is actual count num here we are using formula n(n+1)/2
public class MissingNumber {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 5 };
		int res = FindMissingNum(num, 5);
		System.out.println(res);

	}

	public static int FindMissingNum(int num[], int count) {
		int expsum = count * ((count + 1) / 2);
		int actsum = 0;
		for (int s : num) {
			actsum += s;
		}
		return expsum - actsum;
	}

}
