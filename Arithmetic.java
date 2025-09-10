import java.util.Scanner;
public class Arithmetic {
public static void main(String[] args) {

	Scanner udeze = new Scanner(System.in);

	System.out.print ("First Integer");
	int number1 = udeze.nextInt();

	System.out.print ("Second Integer");
	int number2 = udeze.nextInt();

	int multiply1 = number1 * number1;
	System.out.printf ("Square of Integer is %d%n", multiply1);

	int multiply2 = number2 * number2;
	System.out.printf ("Square of Integer is %d%n", multiply2);

	int sum = number1 * number1 + number2 * number2;
	System.out.printf ("Sum of Square of Integers are %d%n", sum);

	int subtract = number1 * number1 - number2 * number2;
	System.out.printf ("Difference of Square of Integers are %d%n", subtract);


}
}