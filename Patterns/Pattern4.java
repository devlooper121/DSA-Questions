package Patterns;

import java.util.Scanner;

public class Pattern4 {
    /*
     * 1. You are given a number n. 2. You've to create a pattern of * and separated
     * by tab as shown in output format.
     * 
     * 
     * Constraints
     * 1 <= n <= 100
     * 
     * Format
     * Input
     * A number n
     * 
     * Output
     * pat41
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * => * * * *
     * =>   * * *
     * =>     * *
     * =>       *
     *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int nsp = 0;
        int nst = n;
        // write ur code here
        for (int i = 1; i <= n; i++) {
            int Nst = nst;
            int Nsp = 0;
            while (Nsp < nsp) {
                System.out.print("\t");
                Nsp++;
            }
            while (Nst > 0) {
                System.out.print("*\t");
                Nst--;
            }
            nst--;

            nsp++;
            System.out.println("");

        }

    }
}
