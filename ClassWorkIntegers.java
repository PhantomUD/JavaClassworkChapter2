import java.util.Scanner;
public class ClassWorkIntegers {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3;  // Integer division
        int product = num1 * num2 * num3;

        int smallest = num1;
        int largest = num1;

        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;

        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Smallest is %d%n", smallest);
        System.out.printf("Largest is %d%n", largest);
    }
}
