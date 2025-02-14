import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;

public class Main {
    public static void main(String[] args) {

        // Initialize scanner
        Scanner myScanner = new Scanner(System.in);

        // Initialize menu option
        int menuOption = 0;

        do {
            // Prints menu options
            System.out.print("\n1. Add temperature\n2. Move on to next day\n3. Calculate\n4. Exit program");
            System.out.print("\nPlease select: ");

            // If the scanner holds an int, assigns value to menuOption
            if (myScanner.hasNextInt()){
                menuOption = myScanner.nextInt();

                if (menuOption == 1){
                    // add function for adding temp
                }

                if (menuOption == 2){
                    // add function for going to next day
                }

                if (menuOption == 3){
                    // add function for calculating
                }

                if (menuOption == 4){
                    System.exit(0);
                }

            } // Closes checking if scanner has an int

        } // Closes do while

    } // Closes public static void main

} // Closes public class main