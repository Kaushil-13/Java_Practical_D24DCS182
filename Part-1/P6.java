import java.util.Scanner;

public class P6{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days for your exercise routine: ");

        int n = scanner.nextInt();

        scanner.close();
        
        System.out.println("Exercise duration for each day (Fibonacci series):");
        
        for (int i = 0; i < n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    private static int fibonacci(int n)
    {
        if (n <= 1)
        {
            return n;
        }
    
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}