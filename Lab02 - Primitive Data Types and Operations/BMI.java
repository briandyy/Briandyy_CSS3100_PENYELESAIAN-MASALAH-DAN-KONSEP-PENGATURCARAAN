/* ==========================================================================
 * Course : CCS3100 - Problem Solving and Programming Concepts
 * Lab    : Lab 2 (Week 2) - Primitive Data Types and Operations
 * --------------------------------------------------------------------------
 * Question A(4)
 * The individual Body Mass Index (BMI), given the person's weight (kg)
 * and height (meter).
 * (bmi = weight / height^2)
 *
 * File   : BMI.java
 * Author : Afif Febriandy
 * Matric : BC264825
 * ==========================================================================
 */

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        // Prepare a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // 1) Input: weight in kilograms and height in meters
        System.out.print("Enter the weight (kg) : ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the height (m)  : ");
        double height = scanner.nextDouble();

        // 2) Process: bmi = weight / (height x height)
        double bmi = weight / (height * height);

        // 3) Output: display the BMI value
        System.out.println();
        System.out.printf("Body Mass Index (BMI) : %.2f%n", bmi);

        scanner.close();
    }
}
