package Patterns;

import java.util.*;

public class Pattern18 {
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
     * pat181
     * 
     * Example
     * Sample Input
     * 
     * 7
     * 
     * Sample Output
     * => * * * * * * *
     * =>   *       *
     * =>     *   *
     * =>       * 
     * =>     * * *
     * =>   * * * * *
     * => * * * * * * *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int nst = n, nsp = 0;

        for (int row = 1; row <= n; row++) {
            // print space
            for (int i = 1; i <= nsp; i++) {
                System.out.print("\t");
            }
            // printing str
            for (int i = 1; i <= nst; i++) {
                if (row <= n / 2 && row != 1) {
                    if (i > 1 && i < nst) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                } else {
                    System.out.print("*\t");

                }
            }
            // move to newline
            System.out.println();
            if (row <= n / 2) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nst += 2;
            }
        }

    }
}
