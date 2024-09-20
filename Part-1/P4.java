import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days in the month: ");
        
        int numberOfDays = scanner.nextInt();
        
        double[] dailyExpenses = new double[numberOfDays];

        System.out.println("Enter the daily expenses:");

        for (int i = 0; i < numberOfDays; i++){

            System.out.printf("Day %d: ", i + 1);

            dailyExpenses[i] = scanner.nextDouble();
        }

        double totalExpenses = calculateTotalExpenses(dailyExpenses);

        System.out.printf("Total expenses for the month: $%.2f%n", totalExpenses);

        scanner.close();
    }
    public static double calculateTotalExpenses(double[] expenses){

        double sum = 0;

        for (double expense : expenses){

            sum += expense;
            
        }
        return sum;
    }
}
