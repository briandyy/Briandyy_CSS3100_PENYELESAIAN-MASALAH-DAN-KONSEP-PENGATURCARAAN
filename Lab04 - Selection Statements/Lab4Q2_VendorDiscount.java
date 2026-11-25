import java.util.Scanner;

// CSS3100 Lab 4 (Week 4&5) - Question 2
// Vendor Discount (units bought and price per unit)
public class Lab4Q2_VendorDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of units bought: ");
        int units = sc.nextInt();
        System.out.print("Enter price per unit (RM): ");
        double price = sc.nextDouble();

        // find the discount rate: first the unit row, then the price column
        double discountRate;
        if (units > 1000) {
            if (price <= 10.00) {
                discountRate = 0.21;
            } else if (price <= 100.00) {
                discountRate = 0.32;
            } else {
                discountRate = 0.43;
            }
        } else if (units >= 500) {
            if (price <= 10.00) {
                discountRate = 0.14;
            } else if (price <= 100.00) {
                discountRate = 0.23;
            } else {
                discountRate = 0.32;
            }
        } else if (units >= 100) {
            if (price <= 10.00) {
                discountRate = 0.09;
            } else if (price <= 100.00) {
                discountRate = 0.15;
            } else {
                discountRate = 0.21;
            }
        } else if (units >= 10) {
            if (price <= 10.00) {
                discountRate = 0.05;
            } else if (price <= 100.00) {
                discountRate = 0.07;
            } else {
                discountRate = 0.09;
            }
        } else {
            if (price <= 10.00) {
                discountRate = 0.00;
            } else if (price <= 100.00) {
                discountRate = 0.02;
            } else {
                discountRate = 0.05;
            }
        }

        double totalBefore = units * price;
        double discount = totalBefore * discountRate;
        double totalAfter = totalBefore - discount;

        System.out.println();
        System.out.println("Number of units: " + units);
        System.out.printf("Total price before discount: RM%.2f\n", totalBefore);
        System.out.printf("Discount rate: %.0f%%\n", discountRate * 100);
        System.out.printf("Discount amount: RM%.2f\n", discount);
        System.out.printf("Total price after discount: RM%.2f\n", totalAfter);

        sc.close();
    }
}
