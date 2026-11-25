import java.util.Scanner;

// CSS3100 Lab 3 (Week 3) - Question 2
// Payment Receipt
public class Lab3Q2_Receipt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item 1:");
        String name1 = sc.next();
        System.out.print("Quantity:");
        int qty1 = sc.nextInt();
        System.out.print("Unit Price:RM");
        double price1 = sc.nextDouble();

        System.out.print("Item 2:");
        String name2 = sc.next();
        System.out.print("Quantity:");
        int qty2 = sc.nextInt();
        System.out.print("Unit Price:RM");
        double price2 = sc.nextDouble();

        double amount1 = qty1 * price1;
        double amount2 = qty2 * price2;
        double subtotal = amount1 + amount2;
        double tax = subtotal * 0.06;
        double service = subtotal * 0.10;
        double total = subtotal + tax + service;

        System.out.println("Item 1:" + name1);
        System.out.println("Quantity:" + qty1);
        System.out.printf("Unit Price: RM%.2f\n", price1);
        System.out.printf("Amount: RM%.2f\n", amount1);
        System.out.println("*****************************");
        System.out.println("Item 2:" + name2);
        System.out.println("Quantity:" + qty2);
        System.out.printf("Unit Price:RM%.2f\n", price2);
        System.out.printf("Amount: RM%.2f\n", amount2);
        System.out.printf("Subtotal:RM%.2f\n", subtotal);
        System.out.printf("Government Tax:RM%.2f\n", tax);
        System.out.printf("Service Charge:RM%.2f\n", service);
        System.out.printf("Total: RM%.2f\n", total);

        sc.close();
    }
}
