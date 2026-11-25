import java.util.Scanner;

/*
 * Name: [Your Name]
 * Matric No.: [Your Matric Number]
 * Programme: [Your Programme]
 * Lab 6 - Question 2: Zoo Tickets
 */
public class Q2ZooTickets
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int visitor = 1;
        char moreVisitors;

        do
        {
            System.out.println("******VISITOR " + visitor + "*******\n");
            System.out.print("Enter your nationality: ");
            char nationality = input.next().charAt(0);
            double total = 0.0;
            char moreTickets;

            do
            {
                double adultRate = 0.0;
                double childRate = 0.0;
                double seniorRate = 0.0;

                // Pick the rates for this ticket batch.
                if (nationality == 'M')
                {
                    adultRate = 43;
                    childRate = 16;
                    seniorRate = 21;
                }
                else if (nationality == 'F')
                {
                    System.out.print("From which part? (I- Kad/Working Permit/Dependent Pass, E- Asean, O - Others):");
                    char foreignType = input.next().charAt(0);

                    if (foreignType == 'I')
                    {
                        adultRate = 50;
                        childRate = 25;
                        seniorRate = 50;
                    }
                    else if (foreignType == 'E')
                    {
                        adultRate = 61;
                        childRate = 33;
                        seniorRate = 61;
                    }
                    else if (foreignType == 'O')
                    {
                        adultRate = 82;
                        childRate = 43;
                        seniorRate = 82;
                    }
                }

                char category = ' ';
                double rate = 0.0;
                if (adultRate > 0)
                {
                    System.out.print("Choose category of visitor (A- Adult, C - Children, S - senior):");
                    category = input.next().charAt(0);

                    if (category == 'A')
                    {
                        rate = adultRate;
                    }
                    else if (category == 'C')
                    {
                        rate = childRate;
                    }
                    else if (category == 'S')
                    {
                        rate = seniorRate;
                    }
                }

                if (rate == 0)
                {
                    System.out.println("Invalid visitor code.");
                }
                else
                {
                    System.out.print("Number of tickets:");
                    int tickets = input.nextInt();
                    double charge = rate * tickets;
                    total = total + charge;
                    System.out.printf("Visitor Type %c Charge %.2f\n", category, charge);
                }

                System.out.println("Buy other ticket (Y/N)?:");
                moreTickets = input.next().charAt(0);
            }
            while (moreTickets == 'Y');

            System.out.printf("The total payment for VISITOR %d is RM%.2f\n\n", visitor, total);
            System.out.print("Enter another visitor (Y/N)?: ");
            moreVisitors = input.next().charAt(0);
            System.out.println();
            visitor++;
        }
        while (moreVisitors == 'Y');

        input.close();
    }
}
