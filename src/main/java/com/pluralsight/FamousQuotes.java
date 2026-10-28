package com.pluralsight;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String[] quotes = {"Hello,World!",
                "to be or not to be",
                "Be yourself; everyone else is already taken",
                "Be the change you want to be in the world",
                "The journey of a thousand miles begins with one step.",
                "You miss 100 percent of the shots you never take.",
                "Success is the sum of small efforts – repeated day in and day out.",
                "Life can only be understood backwards; but it must be lived forwards.",
                "It is better to be hated for what you are than to be loved for what you are not.",
                "We accept the love we think we deserve."
        };
        displayQuote(myScanner,quotes);
    }

    public static void displayQuote(Scanner myScanner,String[] quotes) {
        boolean selectAgain;

        try { // catching error if user types letter instead of number during quote selection
            do {
                System.out.println("Select 1-10");
                int choice = Integer.parseInt(myScanner.nextLine().trim());

                //switch for menu options
                switch (choice) {
                    case 1 -> System.out.println(quotes[0]);
                    case 2 -> System.out.println(quotes[1]);
                    case 3 -> System.out.println(quotes[2]);
                    case 4 -> System.out.println(quotes[3]);
                    case 5 -> System.out.println(quotes[4]);
                    case 6 -> System.out.println(quotes[5]);
                    case 7 -> System.out.println(quotes[6]);
                    case 8 -> System.out.println(quotes[7]);
                    case 9 -> System.out.println(quotes[8]);
                    case 10 -> System.out.println(quotes[9]);
                    default -> System.out.println("Invalid Choice, Select a number 1-10");
                }
                // asking whether they want to continue
                System.out.println("Would you like to select another option? y/n");
                if (myScanner.nextLine().charAt(0) == 'y') {
                    selectAgain = true;
                } else {
                    selectAgain = false;
                }
            // continue if they select 'y'
            } while (selectAgain);

        } catch (Exception e) {
            System.out.println("ERROR! You must type in a number");
            e.printStackTrace(); //
        }
    }
}
