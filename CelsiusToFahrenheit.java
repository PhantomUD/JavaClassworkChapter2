import java.util.Scanner;
public class CelsiusToFahrenheit {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Celsius temperature: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
    }
}