import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance (in meters): ");
        double distance = sc.nextDouble();
        System.out.println("Enter the time (hours): ");
        double hours = sc.nextDouble();
        System.out.println("Enter the time (minutes): ");
        double minutes = sc.nextDouble();
        System.out.println("Enter the time (seconds): ");
        double seconds = sc.nextDouble();
        double totalHours = hours + minutes / 60 + seconds / 3600;
        double speedMetersPerSecond = distance / (hours * 3600 + minutes * 60 + seconds);
        double speedKilometersPerHour = distance / 1000 / totalHours;
        double speedMilesPerHour = distance / 1609 / totalHours;
        System.out.println("\n");
        System.out.println("Speed : meters per seconr : "+ speedMetersPerSecond);
        System.out.println("Speed : kilometers per hour : "+ speedKilometersPerHour);
        System.out.println("Speed : miles per hour : 12"+ speedMilesPerHour);
        sc.close();
    }
}
