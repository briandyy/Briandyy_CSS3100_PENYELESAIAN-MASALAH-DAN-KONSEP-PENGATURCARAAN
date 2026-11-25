import java.util.Scanner;

// CSS3100 Lab 4 (Week 4&5) - Question 3
// Western Restaurant Menu (switch..case statement)
public class Lab4Q3_RestaurantOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Western Restaurant Menu ===");
        System.out.println("1. Steak         RM29.50");
        System.out.println("2. Grill chicken RM19.50");
        System.out.println("3. Pasta         RM15.00");
        System.out.println("4. Drinks        RM4.90");
        System.out.println("0. Quit");

        System.out.print("Enter your choice (0-4): ");
        int choice = sc.nextInt();

        String item = "";
        double price = 0.0;

        switch (choice) {
            case 1:
                item = "Steak";
                price = 29.50;
                break;
            case 2:
                item = "Grill chicken";
                price = 19.50;
                break;
            case 3:
                item = "Pasta";
                price = 15.00;
                break;
            case 4:
                item = "Drinks";
                price = 4.90;
                break;
            case 0:
                System.out.println("You have chosen to quit the application.");
                break;
            default:
                System.out.println("Invalid choice! Please choose 1, 2, 3, 4, or 0 to quit.");
        }

        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = quantity * price;

            System.out.println();
            System.out.println("You ordered: " + item);
            System.out.printf("Price: RM%.2f\n", price);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Total price: RM%.2f\n", total);
        }

        sc.close();
    }
}
