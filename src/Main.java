import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initializes scanner and prints menu options
        Scanner myScanner = new Scanner(System.in);
        System.out.print("1. Add temperature\n2. Move on to next day\n3. Calculate\n4. Exit program");

        // Initializing the menu option because it was yelling at me
        int menuOption = 0;

        // Prompts user for menu input
        do {
            menuOption = myScanner.nextInt();

            // If user inputs 1, allows them to add a temperature
            if (menuOption == 1) {

                // Asks user how many days they would like to calculate
                System.out.print("How many days would you like to input?");
                int numDays = myScanner.nextInt();

                // Initializes 2 lists that are the size of numDays
                double[] lowTemp = new double[numDays];
                double[] highTemp = new double[numDays];

                // Filling the arrays with a random value and praying the user doesn't input it
                Arrays.fill(highTemp, 3.14159);
                Arrays.fill(lowTemp, 3.14159);

                // Prompts user for the high temp of the day
                System.out.print("Please enter the highest temperature of the day: ");
                double hiTempInput = myScanner.nextDouble();

                // Prompts user for the low temp of the day
                System.out.print("Please enter the lowest temperature of the day: ");
                double lowTempInput = myScanner.nextDouble();


            }

            if (menuOption == 2) {
                System.out.print("Max for the day:\nMin for the day:\nAvg for the day:");
            }

            if (menuOption == 3) {
                System.out.println("Stats for all days:\n" +
                        "Max temp:" +
                        "Min temp:" +
                        "Avg temp:");
            }


        } while (menuOption != 4);


    }
}