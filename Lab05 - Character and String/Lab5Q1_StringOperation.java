import java.util.Scanner;

// Course      : CSS3100 Problem Solving and Programming Concepts
// Lab         : Lab 5 (Lab Assignment 3) - Character and String (Week 6)
// Question    : 1
// Program     : String length check, substring from 5 to 10, and string replacement
// Author      : [Name]
// Matric No.  : [Matric number]
// Programme   : [Study programme]
// Reference   : Topic 5 - Strings (length, indexOf, substring, contains, concatenation)
public class Lab5Q1_StringOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first String
        System.out.print("Enter first String: ");
        String firstString = sc.nextLine();

        int length = firstString.length();

        // if the length exceeds 10, show the characters from 5 to 10
        if (length > 10) {
            // index starts at 0, so position 5 to 10 is substring(4, 10)
            String part = firstString.substring(4, 10);
            System.out.println("Substring from 5 to 10 " + part + ", length " + length);
        } else {
            System.out.println("String length less than 10");
        }

        System.out.println();

        // second String
        System.out.print("Enter second String: ");
        String secondString = sc.nextLine();

        if (firstString.contains(secondString)) {
            System.out.println("Second String exists in First String");

            // replace the second String with "Selamat Datang"
            int position = firstString.indexOf(secondString);
            String newStatement = firstString.substring(0, position)
                    + "Selamat Datang"
                    + firstString.substring(position + secondString.length());

            System.out.println();
            System.out.println("New Statement in String 1 : " + newStatement);
        } else {
            System.out.println("Second String not exists in First String");
        }

        sc.close();
    }
}
