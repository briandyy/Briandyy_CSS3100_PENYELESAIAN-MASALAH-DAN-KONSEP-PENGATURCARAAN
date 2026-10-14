/* ==========================================================================
 * Course : CCS3100 - Problem Solving and Programming Concepts
 * Lab    : Lab 2 (Week 2) - Primitive Data Types and Operations
 * --------------------------------------------------------------------------
 * Question A(2)
 * The sale price of an item given an original price and a discount
 * percentage.
 * (sale = price x (100 - discount percentage) / 100)
 *
 * File   : SalePrice.java
 * Author : Afif Febriandy
 * Matric : BC264825
 * ==========================================================================
 */

import java.util.Scanner;

public class SalePrice
{
    public static void main(String[] args)
    {
        // Prepare a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // 1) Input: original price and discount percentage
        System.out.print("Enter the original price (RM)     : ");
        double price = scanner.nextDouble();

        System.out.print("Enter the discount percentage (%) : ");
        double discount = scanner.nextDouble();

        // 2) Process: sale = price x (100 - discount) / 100
        double sale = price * (100 - discount) / 100.0;

        // 3) Output: display the sale price
        System.out.println();
        System.out.printf("Original price : RM %.2f%n", price);
        System.out.printf("Discount       : %.1f%%%n", discount);
        System.out.printf("Sale price     : RM %.2f%n", sale);

        scanner.close();
    }
}
