// ---------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 - Assignment 2, Question 3

// Calculates the volume and surface area of a cylinder from user inputs of
// radius and height. The results are printed to 4 decimal places.
// ---------------------------------------------------------------------------

import java.text.DecimalFormat;
import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt user for radius and height
        System.out.print("Radius: ");
        double radius = scan.nextDouble();

        System.out.print("Height: ");
        double height = scan.nextDouble();

        // Calculate volume and surface area
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * (height + radius);

        // Format results
        DecimalFormat decimalFormat = new DecimalFormat("0.####");
        String volumeFormatted = decimalFormat.format(volume);
        String surfaceAreaFormatted = decimalFormat.format(surfaceArea);

        // Display results
        System.out.println("\nThe volume of the cylinder is: " + volumeFormatted);
        System.out.println("The surface area of the cylinder is: " + surfaceAreaFormatted);
    }

}
