package io.bryanmullen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice;
        boolean programRunning = true;
        while (programRunning) {
            System.out.print("Type 1 for a Diamond, 2 for Initials, or 3 to quit...");
            choice = scanner.nextByte();
            switch (choice) {
                case 1 -> printDiamond();
                case 2 -> printInitials();
                case 3 -> programRunning = false;
            }
            if (!programRunning) {
                System.out.println("Good Bye");
                break;
            }
        }
    }

    private static void printDiamond() {
        String[] diamond = new String[]{"  *  ", " *** ", "*****", " *** ", "  *  ", "Press any key to continue . . ."};
        print(diamond);
    }

    private static void printInitials() {
        String[] initials = new String[]{
                "BBB       MMMM     MMMM",
                "BB BB     MMMMM   MMMMM",
                "BB  BB    MM MMM MMM MM",
                "BB BB     MM  MM MM  MM",
                "BBBB      MM   MMM   MM",
                "BBBBB     MM         MM",
                "BB  BB    MM         MM",
                "BB   BB   MM         MM",
                "BB  BB    MM         MM",
                "BBBBB     MM         MM"
        };
        print(initials);
    }

    private static void print(String[] toPrint) {
        // Declare variables for use in for loop - i is iterator, x will hold value
        // pulled from array
        int i;
        String x;

        // For loop to print each line from the array one at a time to the console
        for (i = 0; i < toPrint.length; i++) {
            x = toPrint[i];
            System.out.println(x);
        }
    }
}


