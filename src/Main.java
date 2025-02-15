// Program:                 Temperature Calculator
// Author:                  Jayce Baxter
// Date:                    February 14th, 2025
// Description:             Calculates the minimum, maximum and average temperatures given by the user

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{

    // Setting unchanged values as constants
    public static final int MIN_DAYS = 0;
    public static final int MAX_DAYS = 366;
    public static final double MIN_TEMP = -45.00;
    public static final double MAX_TEMP = 45.00;

        // Obviously this is stolen
        // https://www.tpointtech.com/bubble-sort-in-java
        public static void bubbleSort(double[] arr) {
            int n = arr.length;
            double temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Setting decimalformat to 2 decimal places
            DecimalFormat roundedDecimal = new DecimalFormat("#.##");

        // Sets validDays to false so we can use it for validation, turns to true when input is correct
        boolean validDays = false;

        // Initializes numDays because it was out of reach
        int numDays = 0;

        // Runs the while loop until validDays is true
        while (!validDays) {

            // Prompts user to input how many days they want to calculate
            System.out.println("How many days would you like to input? ");

            // If user enters an int, assigns that value to numDays variable and exits loop
            // Also validates that it is between 1 and 365
            if (myScanner.hasNextInt()) {
                numDays = myScanner.nextInt();
                if (numDays > MIN_DAYS && numDays < MAX_DAYS){
                    validDays = true;
                }
                else{
                    System.out.println("Days must be between 1 and 365.");
                }
            } // Closes if statement

            // If user does not enter an int, prints an error message and loops again
            else {
                System.out.println("Input must be a whole number.");

                // I don't know what this even does but stackoverflow said it would stop me from having an infinite loop
                // and they were right
                myScanner.next();
            }
        }
        ;

        // Initializes variables and lists
        double[] lowTemp = new double[numDays];
        double[] highTemp = new double[numDays];
        double[] totalTemp = new double[numDays];

        // Loops for the amount of days in numDays
        for (int i = 0; i < numDays; i++) {

            // Prompts user for the highest temp of the day, saves to hiTempInput
            System.out.println("Please enter the highest temp of the day: ");
            double hiTempInput = myScanner.nextDouble();

            // If the input isn't between -45 and 45, prints error and reprompts
            while (hiTempInput > MAX_TEMP || hiTempInput < MIN_TEMP) {
                System.out.println("Input must be between 45 and -45 degrees");
                System.out.print("Please enter the highest temperature of the day: ");
                hiTempInput = myScanner.nextDouble();
            }

            highTemp[i] = hiTempInput;

            // Prompts user for the lowest temp of the day, saves to lowTempInput
            System.out.println("Please enter the lowest temp of the day: ");
            double lowTempInput = myScanner.nextDouble();

            // If low temp is higher than high temp, loops again
            while (lowTempInput > hiTempInput){
                System.out.println("Invalid input: Low temp cannot be higher than high temp.");
                System.out.println("Please enter the lowest temp of the day: ");
                lowTempInput = myScanner.nextDouble();
            }

            // If the input isn't between -45 and 45, prints error and reprompts
            while (lowTempInput > MAX_TEMP || lowTempInput < MIN_TEMP) {
                System.out.println("Input must be between 45 and -45 degrees");
                System.out.print("Please enter the lowest temperature of the day: ");
                lowTempInput = myScanner.nextDouble();
            }

            // If all checks pass, assigns the current index in lowTemp to the value of lowTempInput
            lowTemp[i] = lowTempInput;

            // Calculates average daily temp
            double avgDailyTemp = (lowTempInput + hiTempInput) / 2;

            // Prints average daily temp
            System.out.println("The average temperature for today was " + roundedDecimal.format(avgDailyTemp) + "\n");

            // Adds highTemp and lowTemp together and adds to totalTemp
            totalTemp[i] = hiTempInput + lowTempInput;

        } // Closes for loop

            // Sorts the 2 lists
            bubbleSort(highTemp);
            bubbleSort(lowTemp);

            // Sets the minimum temperature to be the lowest on the list
            double minTemp = lowTemp[0];

            // Sets the maximum temperature to be the highest on the list
            int highTempLastIndex = highTemp.length - 1;
            double maxTemp = highTemp[highTempLastIndex];

            // Finds the length of the totalTemp list
            int totalTempLength = totalTemp.length * 2;

            // Calculating sum of totalTemp stolen from stackoverflow
            // https://stackoverflow.com/questions/4550662/how-do-you-find-the-sum-of-all-the-numbers-in-an-array-in-java
            double sum = 0;
            for (double i : totalTemp)
                sum += i;

            // Calculates the total average
            double totalAvg = sum / totalTempLength;

            // Prints output to the user
            System.out.println("Over the course of " + numDays + " days:\n" +
                    "The maximum recorded temperature was " + roundedDecimal.format(maxTemp) + "°\n" +
                    "The minimum recorded temperature was " + roundedDecimal.format(minTemp) + "°\n" +
                    "The average temperature was " + roundedDecimal.format(totalAvg) + "°");

    } // Closes public static void main
} // Closes public class main