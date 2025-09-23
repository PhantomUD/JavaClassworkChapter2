import java.util.Scanner;
public class AccountTest {
public static void main(String[] args) {

	Scanner udeze = new Scanner(System.in);
	
	Account ayodeji = new Account();
	
	System.out.printf ("Initial name is %s%n%n", ayodeji.getName());

	System.out.println ("Please enter your name: ");

	String theName = udeze.nextLine();

	ayodeji.setName(theName);

	System.out.println();

	System.out.printf ("Name in object Ayodeji is: %n%s%n", ayodeji.getName());

}
}