import java.util.Scanner;

// CSS3100 Lab 4 (Week 4&5) - Question 5
// CSC3100 Total Marks and Grade (updated from Lab 3)
public class Lab4Q5_CourseMarkGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first test mark (out of 40): ");
        double firstTest = sc.nextDouble();

        System.out.print("Enter second test mark (out of 50): ");
        double secondTest = sc.nextDouble();

        System.out.print("Enter assignment 1 mark (out of 30): ");
        double assign1 = sc.nextDouble();

        System.out.print("Enter assignment 2 mark (out of 30): ");
        double assign2 = sc.nextDouble();

        System.out.print("Enter assignment 3 mark (out of 30): ");
        double assign3 = sc.nextDouble();

        System.out.print("Enter final examination mark (out of 80): ");
        double finalExam = sc.nextDouble();

        // convert every mark to its percentage in the 100% total
        double test1Part = firstTest / 40.0 * 15.0;
        double test2Part = secondTest / 50.0 * 20.0;
        double assignments = assign1 + assign2 + assign3;
        double assignPart = assignments / 90.0 * 35.0;
        double finalPart = finalExam / 80.0 * 30.0;
        double total = test1Part + test2Part + assignPart + finalPart;

        // choose the grade based on the total mark table
        String grade;
        if (total >= 80) {
            grade = "A";
        } else if (total >= 75) {
            grade = "A-";
        } else if (total >= 70) {
            grade = "B+";
        } else if (total >= 65) {
            grade = "B";
        } else if (total >= 60) {
            grade = "B-";
        } else if (total >= 55) {
            grade = "C+";
        } else if (total >= 50) {
            grade = "C";
        } else if (total >= 47) {
            grade = "C-";
        } else if (total >= 44) {
            grade = "D+";
        } else if (total >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println();
        System.out.println("First Test: " + firstTest + " / 40");
        System.out.println("Second Test: " + secondTest + " / 50");
        System.out.println("Assignment 1: " + assign1 + " / 30");
        System.out.println("Assignment 2: " + assign2 + " / 30");
        System.out.println("Assignment 3: " + assign3 + " / 30");
        System.out.println("Final Examination: " + finalExam + " / 80");
        System.out.printf("Total mark: %.2f\n", total);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
