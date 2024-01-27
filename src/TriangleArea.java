// ---------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 - Assignment 2, Question 2

// Uses Heron's formula to calculate the area of a triangle based on the
// lengths of 3 sides (the lengths are entered by the user).
// ---------------------------------------------------------------------------

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt user for the length of 3 sides
        System.out.print("Length of side A: ");
        int sideA = scan.nextInt();

        System.out.print("Length of side B: ");
        int sideB = scan.nextInt();

        System.out.print("Length of side C: ");
        int sideC = scan.nextInt();

       // Calculate semi-perimeter
        double semiperimeter = (double) (sideA + sideB + sideC) / 2;

        // Calculate triangle area
        double semiA = semiperimeter - sideA;
        double semiB = semiperimeter - sideB;
        double semiC = semiperimeter - sideC;
        double radicand = semiperimeter * semiA * semiB * semiC;
        double area = Math.sqrt(radicand);

        System.out.println("The area of the triangle is: " + area);
    }
}