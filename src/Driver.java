import java.util.*;
public class Driver {
	public static void main(String[] args){
		User user = new User();
		System.out.println("Enter First Name: ");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.next();
		user.addFirstName(firstName);
		System.out.println("Enter Last Name: ");
		String lastName = scanner.next();
		user.addLastName(lastName);
	}
}
