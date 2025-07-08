import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid integer! Not: " + trash);
            }
        } while (!done);

        return retValue;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                pipe.nextLine(); // clear input buffer
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid number! Not: " + trash);
            }
        } while (!done);

        return retValue;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                pipe.nextLine(); // clear input buffer
                if (retValue >= low && retValue <= high) {
                    done = true;
                } else {
                    System.out.println("Input is out of range [" + low + " - " + high + "]");
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid integer! Not: " + trash);
            }
        } while (!done);

        return retValue;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retValue = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                pipe.nextLine(); // clear input buffer
                if (retValue >= low && retValue <= high) {
                    done = true;
                } else {
                    System.out.println("Input is out of range [" + low + " - " + high + "]");
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid number! Not: " + trash);
            }
        } while (!done);

        return retValue;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean retValue = false;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim();

            if (response.equalsIgnoreCase("Y")) {
                retValue = true;
                done = true;
            } else if (response.equalsIgnoreCase("N")) {
                retValue = false;
                done = true;
            } else {
                System.out.println("You must enter Y or N. Not: " + response);
            }
        } while (!done);

        return retValue;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();

            if (response.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Input does not match the expected pattern: " + regEx);
            }
        } while (!done);

        return response;
    }

    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        int padding = (WIDTH - 6 - msg.length()) / 2; // total padding on one side (minus 6 for *** + ***)

        // Top border
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Middle line with message centered
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < (WIDTH - 6 - msg.length() - padding); i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Bottom border
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}