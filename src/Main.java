import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        // Sets validDays to false so we can use it for validation, turns to true when input is correct
        boolean validDays = false;

        // Initializes numDays because it was out of reach
        int numDays = 0;

        // Runs the while loop until validDays is true
        while (!validDays) {

            // Prompts user to input how many days they want to calculate
            System.out.println("How many days would you like to input? ");

            // If user enters an int, assigns that value to numDays variable and exits loop
            if (myScanner.hasNextInt()) {
                numDays = myScanner.nextInt();
                validDays = true;
            } // Closes if statement

            // If user does not enter an int, prints an error message and loops again
            else {
                System.out.println("Input must be a whole number.");
            }
        }
        ;

        // Initializes variables and lists
        double[] lowTemp = new double[numDays];
        double[] highTemp = new double[numDays];

        // Loops for the amount of days in numDays
        for (int i = 0; i < numDays; i++) {

            // Prompts user for the highest temp of the day, saves to hiTempInput
            System.out.println("Please enter the highest temp of the day: ");
            double hiTempInput = myScanner.nextDouble();

            // If the input isn't between -45 and 45, prints error and reprompts
            if (hiTempInput > 45 || hiTempInput < -45) {
                System.out.println("Input must be between 45 and -45 degrees");
                System.out.print("Please enter the highest temperature of the day: ");
                hiTempInput = myScanner.nextDouble();
            }

            // Prompts user for the lowest temp of the day, saves to lowTempInput
            System.out.println("Please enter the lowest temp of the day: ");
            double lowTempInput = myScanner.nextDouble();

            // If low temp is higher than high temp, loops again
            if (lowTempInput > hiTempInput){
                System.out.println("Invalid input: Low temp cannot be higher than high temp.");
                i++;
            }

            // If the input isn't between -45 and 45, prints error and reprompts
            if (lowTempInput > 45 || lowTempInput < -45) {
                System.out.println("Input must be between 45 and -45 degrees");
                System.out.print("Please enter the highest temperature of the day: ");
                lowTempInput = myScanner.nextDouble();
            }

            // If all checks pass, assigns the current index in lowTemp to the value of lowTempInput
            else{
                lowTemp[i] = lowTempInput;
            }
        } // Closes for loop

    } // Closes public static void main
} // Closes public class main