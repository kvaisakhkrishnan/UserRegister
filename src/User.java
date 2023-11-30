import java.util.regex.*;
public class User {
	String firstName;
	public void addFirstName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
		Matcher match = pattern.matcher(firstName);
		if(match.matches()) {
			System.out.println("Valid First Name");
			this.firstName = firstName;
		}
		else {
			System.out.println("Invalid First Name");
		}
	}
}
