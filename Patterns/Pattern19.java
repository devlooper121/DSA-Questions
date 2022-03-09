package Patterns;

import java.util.*;

public class Pattern19 {
    /*
     * 1. You are given a number n.
     * 2. You've to write code to print the pattern given in output format below
     * 
     * Constraints
     * 1 <= n <= 10
     * Also, n is odd.
     * 
     * Format
     * Input
     * A number n
     * 
     * Output
     * pat191
     * 
     * Example
     * Sample Input
     * 
     * 7
     * 
     * Sample Output
     * => *       *       *       *                       *
     * =>                         *                       *
     * =>                         *                       *
     * => *       *       *       *       *       *       *
     * => *                       *
     * => *                       *
     * => *                       *       *       *       *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        // write ur code here
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == n / 2 + 1 || col == n / 2 + 1) {
                    System.out.print("*\t");
                } else if (row == 1 & col <= n / 2) {
                    System.out.print("*\t");
                } else if (col == n & row <= n / 2) {
                    System.out.print("*\t");
                } else if (row > n / 2 && col == 1) {
                    System.out.print("*\t");
                } else if (col > n / 2 && row == n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            // move to next line
            System.out.println();
        }

    }
}
