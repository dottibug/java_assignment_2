// ---------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 - Assignment 2, Question 1

// Generates a random password in the pattern of A12B345, where A is the
// first character of the first name, B is the first character of the last
// name, and each digit is randomly generated from a range of 0 to 9.
// ---------------------------------------------------------------------------

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt user for first name and last name
        System.out.print("First name: ");
        String firstName = scan.next();

        System.out.print("Last name: ");
        String lastName = scan.next();

        // Get first character of each name and capitalize
        String firstNameInitial = firstName.substring(0, 1).toUpperCase();
        String lastNameInitial = lastName.substring(0, 1).toUpperCase();

        // Generate 5 random numbers between 0 and 9
        Random generator = new Random();
        final int GEN_MAX = 10;

        int num1 = generator.nextInt(GEN_MAX);
        int num2 = generator.nextInt(GEN_MAX);
        int num3 = generator.nextInt(GEN_MAX);
        int num4 = generator.nextInt(GEN_MAX);
        int num5 = generator.nextInt(GEN_MAX);

        // Create password
        String password =
                firstNameInitial + num1 + num2 + lastNameInitial + num3 + num4 + num5;

        // Display results
        System.out.println("Password: " + password);
    }

}
