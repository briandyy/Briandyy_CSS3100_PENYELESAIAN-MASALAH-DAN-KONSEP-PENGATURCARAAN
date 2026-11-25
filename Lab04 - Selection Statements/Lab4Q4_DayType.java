import java.util.Scanner;

// CSS3100 Lab 4 (Week 4&5) - Question 4
// Convert the given switch...case segment into if statements
public class Lab4Q4_DayType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day number (0-6): ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else if (day == 0 || day == 6) {
            System.out.println("Weekend");
        } else {
            System.out.println("unknown DAY");
        }

        sc.close();
    }
}
