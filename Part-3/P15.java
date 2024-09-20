// import java.util.Scanner;

// class Area {
//     private double length, breadth;
//     public Area(double length, double breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double returnArea() {
//         return length * breadth;
//     }
// }

// public class P15 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Area rectangle = new Area(scanner.nextDouble(), scanner.nextDouble());
//         System.out.println("Area of the rectangle: " + rectangle.returnArea());
//         scanner.close();
//     }
// }
import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class P15
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
       
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
       
        double breadth = scanner.nextDouble();
        
        Area rectangle = new Area(length, breadth);
        
        double area = rectangle.returnArea();
       
        System.out.println("The area of the rectangle is: " + area);
        
        scanner.close();
    }
}