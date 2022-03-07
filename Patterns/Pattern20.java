package Patterns;
import java.util.Scanner;
public class Pattern20 {
    /*
     * 1. You are given a number n.
     * 2. You've to write code to print the pattern given in output format below.
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
     * pat201
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * =>      *        *
     * =>      *        *
     * =>      *    *   *
     * =>      * *    * *
     * =>      *        *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n  =scn.nextInt();
        scn.close();

        for(int row = 1; row <= n; row++){
            for(int i = 1; i<= n; i++){
                //wall
                if(i == 1 ||i == n){
                    System.out.print("*\t");
                }
                // diagonal 1 & 2
                else if(i == row || i+row == n+1){
                    if(row <= n/2){
                        System.out.print("\t");
                    }else{
                        System.out.print("*\t");
                    }
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
