import java.util.Scanner;

public class P13 {
    private String fullName;
    private double monthlySalary;

    public P13(String fullName, double salary) {
        this.fullName = fullName;
        this.monthlySalary = salary > 0 ? salary : 0;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        monthlySalary *= 1.10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name of Employee 1 and monthly salary: ");
        String fullName1 = scanner.next() + " " + scanner.next();
        double salary1 = scanner.nextDouble();

        System.out.print("Enter full name of Employee 2 and monthly salary: ");
        String fullName2 = scanner.next() + " " + scanner.next();
        double salary2 = scanner.nextDouble();

        P13 emp1 = new P13(fullName1, salary1);
        P13 emp2 = new P13(fullName2, salary2);

        System.out.println("\nYearly salary of " + emp1.fullName + ": " + emp1.getYearlySalary());
        System.out.println("Yearly salary of " + emp2.fullName + ": " + emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("\nYearly salary of " + emp1.fullName + " after raise: " + emp1.getYearlySalary());
        System.out.println("Yearly salary of " + emp2.fullName + " after raise: " + emp2.getYearlySalary());

        scanner.close();
    }
}