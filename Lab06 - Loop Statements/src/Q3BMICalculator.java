import java.util.Scanner;

/*
 * Name: [Your Name]
 * Matric No.: [Your Matric Number]
 * Programme: [Your Programme]
 * Lab 6 - Question 3: BMI Calculator
 */
public class Q3BMICalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char nextPerson;

        do
        {
            System.out.println("BMI information:");
            System.out.println("BMI (18.5-24.9) → Normal");
            System.out.println("BMI (25-29.9) → Over Weight");
            System.out.println("BMI (30-34.9) → Obese");
            System.out.println("BMI (35-39.9) → Severely Obese");
            System.out.println("BMI (>=40) → Morbidly Obese");
            System.out.println("********************************************");
            System.out.println("CAUTION!!");
            System.out.println("Women – waist size > 35 inches");
            System.out.println("Men – waist size > 40 inches");
            System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
            System.out.println("\n*******************************************\n");
            System.out.println("HEALTH CALCULATOR\n");

            System.out.print("Enter your name : ");
            String name = input.nextLine();
            System.out.print("Enter your height in meters : ");
            double height = input.nextDouble();
            System.out.print("Enter your weight in kilogram : ");
            double weight = input.nextDouble();
            System.out.print("Enter your waist size in inches :");
            double waist = input.nextDouble();
            System.out.print("Enter waist category (W - Women, M - Men): ");
            char waistCategory = input.next().charAt(0);
            System.out.println();

            if (height > 0)
            {
                double bmi = weight / (height * height);
                String status;

                // Use the BMI before rounding it for display.
                if (bmi < 18.5)
                {
                    status = "Below Normal";
                }
                else if (bmi < 25)
                {
                    status = "Normal";
                }
                else if (bmi < 30)
                {
                    status = "Over Weight";
                }
                else if (bmi < 35)
                {
                    status = "Obese";
                }
                else if (bmi < 40)
                {
                    status = "Severely Obese";
                }
                else
                {
                    status = "Morbidly Obese";
                }
                System.out.printf("%s, your BMI is %.2f, so that means you are %s.\n", name, bmi, status);
            }
            else
            {
                System.out.println(name + ", BMI unavailable: height must be greater than 0.");
            }

            boolean women = waistCategory == 'W' || waistCategory == 'w';
            boolean men = waistCategory == 'M' || waistCategory == 'm';
            if ((women && waist > 35) || (men && waist > 40))
            {
                System.out.println("Waist flag: Above the lab threshold.");
            }
            else if (women || men)
            {
                System.out.println("Waist flag: Not above the lab threshold.");
            }
            else
            {
                System.out.println("Waist flag: Unavailable (use W or M).");
            }

            System.out.print("\nContinue with next person? ");
            nextPerson = input.next().charAt(0);
            input.nextLine(); // Clear the line before reading the next full name.
            System.out.println();
        }
        while (nextPerson != 'n' && nextPerson != 'N');

        System.out.println("Thank you for using this system……");
        input.close();
    }
}
