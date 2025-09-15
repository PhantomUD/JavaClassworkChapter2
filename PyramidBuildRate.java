public class PyramidBuildRate {
public static void main(String[] args) {

        long numberOfBlocks = 2_300_000L;
        double averageWeightPerBlockTons = 2.5;  // tons
        double tonsToKg = 1000.0;  // converting metric tons to kilograms
        double averageWeightPerBlockKg = averageWeightPerBlockTons * tonsToKg;

        int yearsToBuild = 20;
        int daysPerYear = 365;
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        double totalWeightKg = numberOfBlocks * averageWeightPerBlockKg;  // in kg

        double totalYears = yearsToBuild;
        double totalHours = yearsToBuild * daysPerYear * hoursPerDay;
        double totalMinutes = totalHours * minutesPerHour;

        double weightPerYearKg = totalWeightKg / totalYears;
        double weightPerHourKg = totalWeightKg / totalHours;
        double weightPerMinuteKg = totalWeightKg / totalMinutes;

        System.out.printf("Using %d blocks, each %.2f tons (%.0f kg)\n", 
            numberOfBlocks, averageWeightPerBlockTons, averageWeightPerBlockKg);
        System.out.printf("Built over %d years (%d days, %,.0f hours, %,.0f minutes)\n", 
            yearsToBuild, yearsToBuild * daysPerYear, totalHours, totalMinutes);
        System.out.printf("Total weight: %,.0f kg\n", totalWeightKg);
        System.out.printf("Weight built per year: %,.0f kg/year\n", weightPerYearKg);
        System.out.printf("Weight built per hour: %,.0f kg/hour\n", weightPerHourKg);
        System.out.printf("Weight built per minute: %,.0f kg/minute\n", weightPerMinuteKg);
    }
}
