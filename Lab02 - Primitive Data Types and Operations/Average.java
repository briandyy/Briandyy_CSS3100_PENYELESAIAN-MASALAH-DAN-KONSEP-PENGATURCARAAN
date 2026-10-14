/* ==========================================================================
 * Course : CCS3100 - Problem Solving and Programming Concepts
 * Lab    : Lab 2 (Week 2) - Primitive Data Types and Operations
 * --------------------------------------------------------------------------
 * Question A(1)
 * The average of three integers.
 * (average = sum of integers / total integers)
 *
 * File   : Average.java
 * Author : Afif Febriandy
 * Matric : BC264825
 * ==========================================================================
 */

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        // Prepare a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // 1) Input: read the three integers from the user
        System.out.print("Enter the first integer  : ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer : ");
        int second = scanner.nextInt();

        System.out.print("Enter the third integer  : ");
        int third = scanner.nextInt();

        // 2) Process: average = (sum of integers) / (total integers)
        //    Divide by 3.0 so the result keeps its decimal places.
        double average = (first + second + third) / 3.0;

        // 3) Output: display the average
        System.out.println();
        System.out.println("Average of " + first + ", " + second + " and " + third + " = " + average);

        scanner.close();
    }
}
