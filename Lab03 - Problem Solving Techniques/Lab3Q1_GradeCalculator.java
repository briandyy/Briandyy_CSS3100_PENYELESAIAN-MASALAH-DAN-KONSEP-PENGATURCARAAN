import java.util.Scanner;

// CSS3100 Lab 3 (Week 3) - Question 1
// CSC3100 Overall Grade Calculator
public class Lab3Q1_GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Matric: ");
        String matric = sc.next();

        System.out.print("Enter mark for Assessment1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter mark for Assessment2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter mark for Lab Assignment: ");
        double mark3 = sc.nextDouble();

        System.out.print("Enter your Final Exam mark: ");
        double mark4 = sc.nextDouble();

        // calculate the weighted marks and the total
        double a1 = mark1 * 0.15;
        double a2 = mark2 * 0.20;
        double lab = mark3 * 0.35;
        double fin = mark4 * 0.30;
        double total = a1 + a2 + lab + fin;

        // output
        System.out.println("Your total mark for CSC3100 (" + a1 + "+" + a2
                + "+" + lab + "+" + fin + ") is " + total);

        // extra: simple remark
        if (total >= 50) {
            System.out.println("Remarks: PASS");
        } else {
            System.out.println("Remarks: FAIL");
        }

        sc.close();
    }
}
