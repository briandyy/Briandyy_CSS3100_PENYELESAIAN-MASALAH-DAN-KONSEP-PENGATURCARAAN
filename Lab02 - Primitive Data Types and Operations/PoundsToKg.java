/* ==========================================================================
 * Course : CCS3100 - Problem Solving and Programming Concepts
 * Lab    : Lab 2 (Week 2) - Primitive Data Types and Operations
 * --------------------------------------------------------------------------
 * Question A(3)
 * Convert the weight of a parcel given in pounds into kilograms.
 * (1 pound = 0.45359 kg)
 *
 * File   : PoundsToKg.java
 * Author : Afif Febriandy
 * Matric : BC264825
 * ==========================================================================
 */

import java.util.Scanner;

public class PoundsToKg
{
    public static void main(String[] args)
    {
        // Prepare a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // 1) Input: weight of the parcel in pounds
        System.out.print("Enter the weight in pounds (lb) : ");
        double pounds = scanner.nextDouble();

        // 2) Process: kilograms = pounds x 0.45359
        double kilograms = pounds * 0.45359;

        // 3) Output: display the weight in kilograms
        System.out.println();
        System.out.printf("Weight of the parcel : %.4f kg%n", kilograms);

        scanner.close();
    }
}
