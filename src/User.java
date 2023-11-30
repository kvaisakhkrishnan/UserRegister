import java.util.regex.*;
public class User {
	String firstName;
	String lastName;
	String userEmail;
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
	public void addLastName(String lastName) {
		Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
		Matcher match = pattern.matcher(lastName);
		if(match.matches()) {
			System.out.println("Valid Last Name");
			this.lastName = lastName;
		}
		else {
			System.out.println("Invalid Last Name");
		}
	}
	public void matchEmail(String email) {
		Pattern pattern = Pattern.compile("[a-zA-Z]+(\\.[a-zA-Z]+)?@[a-zA-Z]+(\\.[a-zA-Z]+)?\\.[a-zA-Z]+");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			System.out.println("Valid Email");
			this.userEmail = userEmail;
		}
		else {
			System.out.println("Invalid Email");
		}
	}
}
