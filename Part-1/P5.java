// import java.util.Scanner;

public class P5{
    public static void main(String[] args){
        int[] productCodes = {1, 2, 3, 4, 5, 6};
        double[] prices = {1000.0, 500.0, 200.0, 150.0, 800.0, 1200.0};

        // Scanner sc = new Scanner(System.in);

        System.out.println("Electric Appliance Shop Bill");
        System.out.println("----------------------------");
        for (int i = 0; i < productCodes.length; i++) {
            int code = productCodes[i];
            double price = prices[i];

            double taxRate = 0.0;
            switch (code) {
                case 1:
                    taxRate = 0.08;
                    break;
                case 2:
                    taxRate = 0.12;
                    break;
                case 3:
                    taxRate = 0.05;
                    break;
                case 4:
                    taxRate = 0.075;
                    break;
                default:
                    taxRate = 0.03;
            }

            double taxAmount = price * taxRate;
            double totalAmount = price + taxAmount;

            System.out.println("Product Code: " + code);
            System.out.println("Price: $" + price);
            System.out.println("Tax Rate: " + taxRate * 100 + "%");
            System.out.println("Tax Amount: $" + taxAmount);
            System.out.println("Total Amount: $" + totalAmount);
            System.out.println();
        }

        double totalBillAmount = 0.0;
        for (double price : prices) {
            totalBillAmount += price;
        }
        System.out.println("Total Bill Amount: $" + totalBillAmount);
    }
}