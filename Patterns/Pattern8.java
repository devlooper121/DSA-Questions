package Patterns;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
         * Pattern 8
         * Easy
         * 
         * 1. You are given a number n.
         * 2. You've to create a pattern of * and separated by tab as shown in output
         * format.
         * 
         * Constraints
         * 1 <= n <= 100
         * 
         * Format
         * Input
         * A number n
         * 
         * Output
         * pat81
         * 
         * Example
         * Sample Input
         * 
         * 5
         * 
         * Sample Output
         * =>                   *
         * =>               *
         * =>           *
         * =>       *
         * =>   *
         */
        // write ur code here
        int n = scn.nextInt();
        scn.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}
