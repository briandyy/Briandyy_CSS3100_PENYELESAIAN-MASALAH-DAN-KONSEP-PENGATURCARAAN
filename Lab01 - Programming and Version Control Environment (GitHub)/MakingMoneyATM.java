/* ==========================================================================
 * Course : CCS3100 - Problem Solving and Programming Concepts
 * Lab    : Lab 1 (Week 1) - Programming and Version Control Environment (GitHub)
 * --------------------------------------------------------------------------
 * Question 4
 * Making Money Bank intends to provide a new automated teller machine (ATM)
 * for the customers to perform basic financial transactions. The company has
 * asked you to write a Java application for the ATM.
 *
 * This program displays "Making Money Bank ATM Service" and "Welcome!" in an
 * attractive layout on the console screen (comments included, as required).
 *
 * File   : MakingMoneyATM.java
 * Author : Afif Febriandy
 * Matric : BC264825
 * ==========================================================================
 */

public class MakingMoneyATM
{
    public static void main(String[] args)
    {
        // Top border of the banner
        System.out.println("********************************************************************");

        // Empty line inside the banner
        System.out.println("*                                                                  *");

        // Bank name, centred inside the banner
        System.out.println("*                    Making Money Bank ATM Service                 *");

        // Empty line inside the banner
        System.out.println("*                                                                  *");

        // Bottom border of the banner
        System.out.println("********************************************************************");

        // Welcome greeting for the customer
        System.out.println();
        System.out.println("Welcome!");
    }
}
