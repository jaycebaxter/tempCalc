import java.text.DecimalFormat;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;


public class Main {
    public static void main(String[] args) {

        // Initializes scanner
        Scanner myScanner = new Scanner(System.in);

        // Initializing the menu option because it was yelling at me
        int menuOption = 0;
        int numDays = 0;
        float maxTemp = 0;
        float minTemp = 0;

        // Initializes 2 lists that are the size of numDays
        double[] lowTemp = new double[numDays];
        double[] highTemp = new double[numDays];

        do {

            // Prints menu options
            System.out.print("1. Add temperature\n2. Move on to next day\n3. Calculate\n4. Exit program");
            System.out.print("\nPlease select: ");

            // If the scanner holds an int, assigns value to menuOption
            if (myScanner.hasNextInt()) {
                menuOption = myScanner.nextInt();

                // If user inputs 1, allows them to add a temperature
                if (menuOption == 1) {

                    // Asks user how many days they would like to calculate
                    System.out.print("How many days would you like to input? ");
                    if (myScanner.hasNextInt()) {
                        numDays = myScanner.nextInt();

                        for (int i = 0; i < numDays; i++) {

                        }


                        // Initializing variables to use to add to the arrays
                        double hiTempInput;
                        double lowTempInput;



                        // Prompts user for the high temp of the day
                        System.out.print("Please enter the highest temperature of the day: ");
                        hiTempInput = myScanner.nextDouble();

                        // If the input isn't between -45 and 45, prints error and reprompts
                        if (hiTempInput > 45 || hiTempInput < -45) {
                            System.out.println("Input must be between 45 and -45 degrees");
                            System.out.print("Please enter the highest temperature of the day: ");
                            hiTempInput = myScanner.nextDouble();
                        }

                        // Adds hiTempInput to highTemp list
                        // Replaces any 3.14159 value
                        else {
                            for (int i = 0; i < highTemp.length; i++)
                                if (highTemp[i] == 3.14159) {
                                    highTemp[i] = hiTempInput;
                                }
                        }

                        // Prompts user for the low temp of the day
                        System.out.print("Please enter the lowest temperature of the day: ");
                        lowTempInput = myScanner.nextDouble();

                        // If the input isn't between -45 and 45, prints error and reprompts
                        if (lowTempInput > 45 || lowTempInput < -45) {
                            System.out.println("Input must be between 45 and -45 degrees");
                            System.out.print("Please enter the highest temperature of the day: ");
                            lowTempInput = myScanner.nextDouble();
                        }

                        // Adds lowTempInput to lowTemp list
                        // Replaces any 3.14159 value
                        else {
                            for (int i = 0; i < lowTemp.length; i++)
                                if (lowTemp[i] == 3.14159) {
                                    lowTemp[i] = lowTempInput;
                                }
                        }

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

                for (int j = 0; j > 366; j++) {
                    if (highTemp[j - 1] > minTemp) ;
                    highTemp[j] = minTemp;
                } // Closes for loop

                for (int k = 0; k > 366; k++) {
                    if (lowTemp[k - 1] > minTemp) ;
                    lowTemp[k] = minTemp;
                } // Closes for loop


                for (int h = 0; h > 366; h++) {
                    if (highTemp[h - 1] > maxTemp) ;
                    highTemp[h] = maxTemp;
                } // Closes for loop

                for (int g = 0; g > 366; g++) {
                    if (lowTemp[g - 1] > maxTemp);
                    lowTemp[g] = maxTemp;
                }

                System.out.print("Min for the day: " + minTemp +
                        "Max for the day: " + maxTemp);
            }

            if (menuOption == 3) {

                // Stole this
                // https://stackoverflow.com/questions/4550662/how-do-you-find-the-sum-of-all-the-numbers-in-an-array-in-java
                double sumHigh = DoubleStream.of(highTemp).sum();
                double sumLow = DoubleStream.of(lowTemp).sum();
                double totalSum = sumHigh + sumLow;
                double avgTemp = totalSum / highTemp.length;

                DecimalFormat roundedDecimal = new DecimalFormat("#.##");

                System.out.println("Stats for all days:\n" +
                        "Max temp:" + roundedDecimal.format(maxTemp) +
                        "Min temp:" + roundedDecimal.format(minTemp) +
                        "Avg temp: " + roundedDecimal.format(avgTemp));
            }


        } while (menuOption != 4);


    }
}