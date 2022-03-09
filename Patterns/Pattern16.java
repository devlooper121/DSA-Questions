package Patterns;

import java.util.*;

public class Pattern16 {
    /*
     * 1. You are given a number n.
     * 2. You've to write code to print the pattern given in output format below
     * 
     * Constraints
     * 1 <= n <= 10
     * 
     * Format
     * Input
     * A number n
     * 
     * Output
     * pat161
     * 
     * Example
     * Sample Input
     * 
     * 7
     * 
     * Sample Output
     * 1                       1
     * 1 2                   2 1
     * 1 2 3               3 2 1
     * 1 2 3 4           4 3 2 1
     * 1 2 3 4 5       5 4 3 2 1
     * 1 2 3 4 5 6   6 5 4 3 2 1
     * 1 2 3 4 5 6 7 6 5 4 3 2 1
     */
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 2 * n - 3, nst = 1;
        for (int row = 1; row <= n; row++) {
            //
            
            for (int i = 1; i <= nst; i++) {
                System.out.print(i + "\t");
            }
            for (int i = 1; i <= nsp; i++) {
                System.out.print("\t");
            }
            if (row == n) {
                nst--;
            }
            for (int i = nst; i > 0; i--) {
                System.out.print(i + "\t");
            }
            System.out.println();
            nsp -= 2;
            nst++;
        }
    }

}