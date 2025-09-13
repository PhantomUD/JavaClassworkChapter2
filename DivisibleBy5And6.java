import java.util.Scanner;
public class DivisibleBy5And6 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean divisibleBy5 = number % 5 == 0;
        boolean divisibleBy6 = number % 6 == 0;

        System.out.printf("Is %d divisible by 5 and 6? %b%n", number, (divisibleBy5 && divisibleBy6));
        System.out.printf("Is %d divisible by 5 or 6? %b%n", number, (divisibleBy5 || divisibleBy6));
        System.out.printf("Is %d divisible by 5 or 6, but not both? %b%n", number, (divisibleBy5 ^ divisibleBy6));
    }
}
