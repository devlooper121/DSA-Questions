package Patterns;
import java.util.Scanner;
public class Pattern17 {
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
     * pat171
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * = >      * 
     * = >      * *
     * = >  * * * * *
     * = >      * *
     * = >      *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();
        int  nst = 1;
        for(int row = 1; row <= n; row++){
            // for one line
            // printing space if row != n/2; else print star
            // Arrow TAIL
            for(int i = 1; i <= n/2; i++){
                    if(row == n/2+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }

            // print star // Arrow HEAD
            for(int i = 1; i <= nst; i++){
                System.out.print("*\t");
            }
            // move to nextline
            System.out.println();
            if(row <= n/2){
                nst++;
            }else{
                nst--;
            }
            
        }
    }
}
