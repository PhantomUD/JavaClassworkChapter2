import java.util.Scanner;
public class Demo2Test {
public static void main(String[] args) {	

	Scanner input = new Scanner(System.in);

	Demo2 address = new Demo2();

	System.out.printf("Initial Name is: %s%n%n", address.getAddress());

	System.out.println("Please enter your name: ");

	String theAddress = input.nextLine();

	address.setAddress(theAddress);

	System.out.println();

	System.out.printf("The name of your account Name: %n%s%n", address.getAddress()); 



	Scanner input2 = new Scanner(System.in);
	
	Demo2 email = new Demo2();

	System.out.printf("Initial Email is: %s%n%n", email.getEmail());

	System.out.println("Please enter your email: ");

	String theEmail = input2.nextLine();

	email.setEmail(theEmail);

	System.out.println();

	System.out.printf("The name of your email is: %n%s%n", email.getEmail());



	Scanner input3 = new Scanner(System.in);

	Demo2 phoneNumber = new Demo2();
	
	System.out.printf("Initial Phone number is: %s%n%n", phoneNumber.getPhoneNumber());

	System.out.println("Please enter your Phone number: ");

	String thePhoneNumber = input3.nextLine();

	phoneNumber.setPhoneNumber(thePhoneNumber);

	System.out.println();

	System.out.printf("The number of your phone is: %n%s%n", phoneNumber.getPhoneNumber());


}
}