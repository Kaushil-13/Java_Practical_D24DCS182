import java.util.Scanner;

public class P12
{
    public static void main(String[] args)
    {
        double pounds = 0;

        if (args.length > 0)
        {
            pounds = Double.parseDouble(args[0]);
        }
        else 
        {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter amount in Pounds: ");
            
            if (scanner.hasNextDouble())
            {
                pounds = scanner.nextDouble();
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
            }
            scanner.close();
        }
        
        double rupees = pounds * 100;
        
        System.out.println("Pounds In To Rupees Is : "+ rupees);
    }
}