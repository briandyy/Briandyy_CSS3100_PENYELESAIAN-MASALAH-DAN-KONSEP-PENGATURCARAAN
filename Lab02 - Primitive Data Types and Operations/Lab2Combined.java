/* ==========================================================================
 * Course : CCS3100 - Problem Solving and Programming Concepts
 * Lab    : Lab 2 (Week 2) - Primitive Data Types and Operations
 * --------------------------------------------------------------------------
 * Bonus  : Combined version — all four calculations in a single program.
 *
 * Lab sheet option B: "You may separate the program by calculations or
 * combine all calculations into a single program." This program combines
 * questions A(1) – A(4) into one single run.
 *
 * File   : Lab2Combined.java
 * Author : Afif Febriandy
 * Matric : BC264825
 * ==========================================================================
 */

import java.util.Scanner;

public class Lab2Combined
{
    public static void main(String[] args)
    {
        // One scanner shared by all four calculations
        Scanner scanner = new Scanner(System.in);

        // ================= 1) Average of three integers =================
        System.out.println("-- Question A(1): Average of three integers --");
        System.out.print("Enter the first integer  : ");
        int first = scanner.nextInt();
        System.out.print("Enter the second integer : ");
        int second = scanner.nextInt();
        System.out.print("Enter the third integer  : ");
        int third = scanner.nextInt();
        double average = (first + second + third) / 3.0;
        System.out.println("Average of " + first + ", " + second + " and " + third + " = " + average);
        System.out.println();

        // ================= 2) Sale price =================
        System.out.println("-- Question A(2): Sale price --");
        System.out.print("Enter the original price (RM)     : ");
        double price = scanner.nextDouble();
        System.out.print("Enter the discount percentage (%) : ");
        double discount = scanner.nextDouble();
        double sale = price * (100 - discount) / 100.0;
        System.out.printf("Sale price : RM %.2f%n", sale);
        System.out.println();

        // ================= 3) Pounds to kilograms =================
        System.out.println("-- Question A(3): Pounds to kilograms --");
        System.out.print("Enter the weight in pounds (lb) : ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.45359;
        System.out.printf("Weight of the parcel : %.4f kg%n", kilograms);
        System.out.println();

        // ================= 4) Body Mass Index =================
        System.out.println("-- Question A(4): Body Mass Index --");
        System.out.print("Enter the weight (kg) : ");
        double weight = scanner.nextDouble();
        System.out.print("Enter the height (m)  : ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Body Mass Index (BMI) : %.2f%n", bmi);

        scanner.close();
    }
}
