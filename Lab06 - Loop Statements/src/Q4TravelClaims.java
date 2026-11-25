import java.util.Scanner;

/*
 * Name: [Your Name]
 * Matric No.: [Your Matric Number]
 * Programme: [Your Programme]
 * Lab 6 - Question 4: Travel Claims
 */
public class Q4TravelClaims
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        for (int staff = 1; staff <= 20; staff++)
        {
            System.out.print("Enter trip distance for staff " + staff + " (km): ");
            double distance = input.nextDouble();
            double claim;

            if (distance <= 500)
            {
                claim = distance * 0.70;
            }
            else
            {
                claim = 500 * 0.70 + (distance - 500) * 0.50;
            }

            System.out.printf("Total mileage claim for staff %d: RM%.2f\n", staff, claim);
        }

        input.close();
    }
}
