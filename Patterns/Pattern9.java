package Patterns;

import java.util.Scanner;

public class Pattern9 {
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
     * pat91
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * => *                 *
     * =>      *        *
     * =>           *
     * =>      *        *
     * => *                 *
     */
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col <= n; col++){
                if(row == col || row+col == n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
