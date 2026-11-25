import java.util.Scanner;

/*
 * Name: [Your Name]
 * Matric No.: [Your Matric Number]
 * Programme: [Your Programme]
 * Lab 6 - Question 1: Product Sales
 */
public class Q1ProductSales
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter product number (0 to stop): ");
        int productNumber = input.nextInt();

        while (productNumber != 0)
        {
            double price;
            switch (productNumber)
            {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    price = 0.0;
                    System.out.println("Invalid product number.");
            }

            if (price > 0)
            {
                System.out.print("Enter quantity sold: ");
                int quantity = input.nextInt();
                total = total + price * quantity;
            }

            System.out.print("Enter product number (0 to stop): ");
            productNumber = input.nextInt();
        }

        System.out.printf("Total retail value: RM%.2f\n", total);
        input.close();
    }
}
