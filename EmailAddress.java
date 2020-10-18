import java.util.Scanner;
/**
 * 
 *Author: Gavin Clark
 *Date: Sep 25, 2020
 *Description: This program takes the users input and prints an email
 */
public class EmailAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter your first name.");
		String firstName = keyboard.nextLine();
		firstName = (firstName.toUpperCase());
		System.out.println("Please enter your middle name.");
		String middleName = keyboard.nextLine();
		middleName = (middleName.toUpperCase());
		System.out.println("Please enter your last name.");
		String lastName = keyboard.nextLine();
		System.out.println("Please enter your birthday(mm-dd-yyyy).");
		String birthday = keyboard.nextLine();
		//This is a good spot to separate user input from output
		//Delineating using whitespace is a good indicator of what code can be refactored into a method (or function)
		System.out.print("Email: ");
		System.out.print(lastName.toLowerCase());
		System.out.print(firstName.substring(0,1) + middleName.substring(0,1));
		System.out.println("@sharkmail.com");
		System.out.println("Temp Password: " + birthday);
		System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
		keyboard.close();
	}

}
//Great. I would use white space to break up parts of my code, though.
