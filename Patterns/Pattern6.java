package Patterns;
import java.util.Scanner;
public class Pattern6 {
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
     * pat61
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * =>  * * *   * * *
     * =>  * *       * *
     * =>  *           *
     * =>  * *       * *
     * =>  * * *   * * *
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        // write ur code here
        int nst = n/2+1, nsp = 1;

        for(int row = 1; row <= n; row++){
            // first line
            // first star
            for(int i = 1; i <= nst; i++){
                System.out.print("*\t");
            }
            // first space
            for(int i = 1; i <= nsp; i++){
                System.out.print("\t");
            }
            // first star 2
            for(int i = 1; i <= nst; i++){
                System.out.print("*\t");
            }
            // moving to nextLine

            System.out.println();
            // prepration for next Row
            
            if(row <= n/2){
                nst--;
                nsp += 2;
            }else{
                nst++;
                nsp -= 2;
            }
        }

    }
}
