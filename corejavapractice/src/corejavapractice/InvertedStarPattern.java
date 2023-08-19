package corejavapractice;

import java.util.Scanner;

public class InvertedStarPattern {

    public static void printInvertedRightAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            } 

            // Print stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        printInvertedRightAngledTriangle(n);

        scanner.close();
    }
}
