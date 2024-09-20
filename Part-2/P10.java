import java.util.Arrays;
import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();  

        System.out.println("Length of the string: " + str.length());
        System.out.println("Lowercase of the string: " + str.toLowerCase());
        System.out.println("Uppercase of the string: " + str.toUpperCase());

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);
        System.out.println("Sorted string: " + sorted);

        scanner.close();  
    }
}
