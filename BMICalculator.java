import java.util.Scanner;

public class BMICalculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        int weight = input.nextInt();

        System.out.print("Enter your height in inches: ");
        int height = input.nextInt();

        int bmi = (weight * 703) / (height * height);

        System.out.println("\nYour BMI is: " + bmi);

        System.out.println("\nBMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      18.5 – 24.9");
        System.out.println("Overweight:  25 – 29.9");
        System.out.println("Obese:       30 or greater");

    }
}
