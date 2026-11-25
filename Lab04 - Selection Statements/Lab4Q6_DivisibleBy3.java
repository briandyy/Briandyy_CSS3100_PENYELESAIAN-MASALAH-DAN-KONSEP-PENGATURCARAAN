import java.util.Scanner;

// CSS3100 Lab 4 (Week 4&5) - Question 6
// Convert the given if segment into a conditional (ternary) operator
public class Lab4Q6_DivisibleBy3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 3 == 0) ? "Divisible by 3 : " + num : "NOT Divisible by 3 : " + num;
        System.out.println(result);

        sc.close();
    }
}
