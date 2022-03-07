package Patterns;

import java.util.Scanner;

public class Pattern5 {
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
     * pat51
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     *       *
     *      * *
     *    * * * *
     *      * *
     *       *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        // write ur code here

        int nsp = n/2, nst = 1;

        for(int row = 1; row <= n; row++){
            // code for first line
            // 1. print the spaces
            for(int i = 1; i <= nsp; i++){
                System.out.print("\t");
            }
            //2. print stars
            for(int i = 1; i <= nst; i++){
                System.out.print("*\t");
            }
            // moving to next line
            System.out.println();
            if(row<=n/2){// first half (because we are using from 1 not 0)
                nsp--;
                nst += 2;
            }else{ // second half
                nsp++;
                nst -= 2;
            }
        }

    }
}
