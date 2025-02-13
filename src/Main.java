import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        scanner myScanner = new Scanner(System.in);
        System.out.print("1. Add temperature\n2. Move on to next day\n3. Calculate\n4. Exit program");

        do {
            Int menuOption = myScanner.nextInt();

            if (menuOption.equals("1")){
                System.out.print("Please enter a temperature");

            }

            if (menuOption.equals("2")){
                System.out.print("Max for the day:\nMin for the day:\nAvg for the day:")
            }

            if (menuOption.equals("3")){
                System.out.println("Stats for all days:\n" +
                        "Max temp:" +
                        "Min temp:" +
                        "Avg temp:");
            }



        } while(menuOption != "3");

    // Initializing lists
        double [] dailyTemp =
    }
}