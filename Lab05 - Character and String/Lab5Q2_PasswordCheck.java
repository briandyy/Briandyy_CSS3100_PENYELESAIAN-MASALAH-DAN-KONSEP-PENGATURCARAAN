import java.util.Scanner;

// Course      : CSS3100 Problem Solving and Programming Concepts
// Lab         : Lab 5 (Lab Assignment 3) - Character and String (Week 6)
// Question    : 2
// Program     : Password length validation and string combination
// Author      : [Name]
// Matric No.  : [Matric number]
// Programme   : [Study programme]
public class Lab5Q2_PasswordCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first String (the password)
        System.out.print("Enter first String: ");
        String firstString = sc.nextLine();

        int length = firstString.length();

        // password must be longer than 8 characters
        if (length > 8) {
            System.out.println("Valid password!!");
            System.out.println("First String : \"" + firstString + "\" with length " + length);
        } else {
            System.out.println("Invalid password");
            System.out.println("First String : \"" + firstString + "\" with length " + length);
        }

        System.out.println();

        // second String
        System.out.print("Enter second String: ");
        String secondString = sc.nextLine();

        boolean exists = firstString.contains(secondString);

        if (exists) {
            System.out.println("Second String exists in First String");
        } else {
            System.out.println("Second String not exists in First String");
            String newStatement = firstString + secondString;
            System.out.println();
            System.out.println("New Statement in String 1 : " + newStatement);
        }

        sc.close();
    }
}
