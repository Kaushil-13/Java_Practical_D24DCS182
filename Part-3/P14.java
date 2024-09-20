import java.util.Scanner;

public class P14
{
    int month, day, year;

    public P14(int m, int d, int y)
    {
        month = m; day = d; year = y;
    }

    public void displayDate()
    {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        
        int month = sc.nextInt();
        
        System.out.print("Enter day: ");
        
        int day = sc.nextInt();
        
        System.out.print("Enter year: ");
        
        int year = sc.nextInt();

        P14 date = new P14(month, day, year);
        
        date.displayDate();
        
        sc.close();
    }
}
