package TrickyQuestion;

import java.net.MalformedURLException;
import java.net.URL;

// What will be the output when you compare site URL with its ip address?
public class CompIPWURL {

	public static void main(String[] args) {

		try {
			System.out.println(new URL("https://naveenautomationlabs.com").equals(new URL("https://45.130.228.5 ")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
