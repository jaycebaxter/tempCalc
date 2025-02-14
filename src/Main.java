import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initializes scanner
        Scanner myScanner = new Scanner(System.in);

        // Initializing the menu option because it was yelling at me
        int menuOption = 0;

        do {

            // Prints menu options
            System.out.print("1. Add temperature\n2. Move on to next day\n3. Calculate\n4. Exit program");
            System.out.print("\nPlease select: ");

            // If the scanner holds an int, assigns value to menuOption
            if (myScanner.hasNextInt()){
                menuOption = myScanner.nextInt();

                // If user inputs 1, allows them to add a temperature
                if (menuOption == 1) {

                    // Asks user how many days they would like to calculate
                    System.out.print("How many days would you like to input?");
                    if (myScanner.hasNextInt()){
                        int numDays = myScanner.nextInt();

                        // Initializes 2 lists that are the size of numDays
                        double[] lowTemp = new double[numDays];
                        double[] highTemp = new double[numDays];

                        // Initializing variables to use to add to the arrays
                        double hiTempInput;
                        double lowTempInput;

                        // Filling the arrays with a random value and praying the user doesn't input it
                        Arrays.fill(highTemp, 3.14159);
                        Arrays.fill(lowTemp, 3.14159);

                        // Prompts user for the high temp of the day
                        System.out.print("Please enter the highest temperature of the day: ");
                        hiTempInput = myScanner.nextDouble();

                        // If the input isn't between -45 and 45, prints error and reprompts
                        if (hiTempInput > 45 || hiTempInput < -45){
                            System.out.println("Input must be between 45 and -45 degrees");
                            System.out.print("Please enter the highest temperature of the day: ");
                            hiTempInput = myScanner.nextDouble();
                        }

                        else{
                            for(int i = 0; i < highTemp.length; i++)
                                if (highTemp[i] == 3.14159) {
                                    highTemp[i] = hiTempInput;
                                }
                        }

                        System.out.println(highTemp);

                        // Prompts user for the low temp of the day
                        System.out.print("Please enter the lowest temperature of the day: ");
                        lowTempInput = myScanner.nextDouble();


                    }

                    // Prints an error message and clears the scanner if input is invalid
                    // Stole this because I didn't know how to do it and made an infinite loop
                    // If this isn't the right way to do it, I'd love to know what is
                    // https://stackoverflow.com/questions/10604125/how-can-i-clear-the-scanner-buffer-in-java
                    else {
                        System.out.println("Please enter a whole number.");
                        myScanner.nextLine();
                    }


                }

            }



            // Prints an error message and clears the scanner if input is invalid
            else {
                System.out.println("Please input a whole number.");
                myScanner.nextLine();
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