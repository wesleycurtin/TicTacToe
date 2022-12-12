import java.util.Scanner;
public class SafeInput {
    // Class variables go here and are visible to the methods below main

    /**
     * Get an integer value within a specified range of low - high
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String that tells the user what to input
     * @param low    low value for a range low - high
     * @param high   high value for the range
     * @return an int within the low - high range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = low - 1;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]:");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); //clear the newline from the buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You said your val is " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else { //don't have an int
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);

        return retVal;
    }


    /**
     * Use Scanner to get an int from the console with no constraints
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String Prompt to tell the user what to input
     * @return An integer value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;//clear the newline from the buffer
            } else { //don't have an int
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);

        return retVal;
    }


    /**
     * Use Scanner to get a double from the console with no constraints
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String Prompt to tell the user what to input
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;//clear the newline from the buffer
            } else { //don't have an int
                trash = pipe.nextLine();
                System.out.println("You must enter an double not " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * Get an integer value within a specified range of low - high
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String that tells the user what to input
     * @param low    low value for a range low - high
     * @param high   high value for the range
     * @return an int within the low - high range
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = low - 1;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]:");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); //clear the newline from the buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You said your val is " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else { //don't have an int
                trash = pipe.nextLine();
                System.out.println("You must enter an double not " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * Get an arbitrary String of at least one character in length
     *
     * @param pipe   Scanner to use for input
     * @param prompt Prompt Msg for use about what to input
     * @return A String entered by the user of at least one character
     */
    public static String getNonZerolength(Scanner pipe, String prompt) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() > 0) {
                done = true;
            } else {
                System.out.println("You must enter at least one character ");
            }

        } while (!done);

        return retVal;
    }

    /**
     * Gets a String that matches a Regular Expression pattern like ###-##-#### \d{3}-\d{2}-\d{4}
     *
     * @param pipe    Scanner to use for input
     * @param prompt  String prompt to tell the user what to input
     * @param pattern User entered pattern
     * @return A String that matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String pattern) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(pattern)) {
                done = true;
            } else {
                System.out.println("What you have entered does not match the pattern. " + pattern);
            }

        } while (!done);

        return retVal;


    }

    /**
     * Gets a Y or an N from the user and returns a True or False respectively
     *
     * @param pipe   Scanner to use for input
     * @param prompt String prompt to tell the user what to input
     * @return A boolean value true for yes and false for no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String respYN = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            respYN = pipe.nextLine();

            if (respYN.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (respYN.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter [Y/N]");
            }
        } while (!done);

        return retVal;
    }
}

