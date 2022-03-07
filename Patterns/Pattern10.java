package Patterns;
import java.util.Scanner;
public class Pattern10 {
    /*
     * 1. You are given a number n.
     * 2. You've to create a pattern of * and separated by tab as shown in output
     * format.
     * 
     * Constraints
     * 1 <= n <= 100
     * Also, n is odd.
     * 
     * Format
     * Input
     * A number n
     * 
     * Output
     * pat101
     *  
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * => *
     * => * *
     * => * *
     * => * *
     * => *
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();

        int nsp = n / 2, nst = 1;
        for (int row = 1; row <= n; row++) {
            // Approach by sir print pattern 5 then make pattern 10
            // print space
            for (int i = 1; i <= nsp; i++) {
                if (row == 1) {
                    continue; // again because test case is wrong 😜.
                }
                System.out.print("\t");
            }
            // print star
            for (int i = 1; i <= nst; i++) {
                if (i == 1 || i == nst) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            // move to new line
            System.out.print("\n");
            // next row setup
            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }

        }

    }
}
