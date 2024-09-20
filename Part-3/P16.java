import java.util.Scanner;

class Complex {
    private double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class P16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginary parts of first complex number (e.g., 1 2): ");
        Complex num1 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        
        System.out.println("Enter real and imaginary parts of second complex number (e.g., 3 4): ");
        Complex num2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Sum: " + num1.add(num2));
        System.out.println("Difference: " + num1.subtract(num2));
        System.out.println("Product: " + num1.multiply(num2));

        scanner.close();
    }
}
