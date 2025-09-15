import java.util.Scanner;
public class WorldPopulationGrowth {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter the annual growth rate (in %): ");
        double growthRate = input.nextDouble() / 100.0; // convert to decimal

        System.out.printf("%-5s%-20s%n", "Year", "Estimated Population");

        for (int year = 1; year <= 5; year++) {
            double futurePopulation = population * Math.pow(1 + growthRate, year);
            System.out.printf("%-5d%-20.2f%n", year, futurePopulation);
        }

    }
}
