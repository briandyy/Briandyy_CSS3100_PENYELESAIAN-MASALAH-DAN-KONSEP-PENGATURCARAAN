import java.util.Scanner;

// CSS3100 Lab 4 (Week 4&5) - Question 1
// Quantity Discount for Packages
public class Lab4Q1_PackageDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = 45.20;

        System.out.print("Enter number of packages purchased: ");
        int quantity = sc.nextInt();

        // find the discount rate based on the quantity
        double discountRate;
        if (quantity >= 100) {
            discountRate = 0.15;
        } else if (quantity >= 50) {
            discountRate = 0.10;
        } else if (quantity >= 30) {
            discountRate = 0.05;
        } else if (quantity >= 10) {
            discountRate = 0.03;
        } else {
            discountRate = 0.00;
        }

        double amount = quantity * price;
        double discount = amount * discountRate;
        double total = amount - discount;

        System.out.println();
        System.out.println("Package quantity: " + quantity);
        System.out.printf("Discount amount: RM%.2f\n", discount);
        System.out.printf("Total amount after discount: RM%.2f\n", total);

        sc.close();
    }
}
