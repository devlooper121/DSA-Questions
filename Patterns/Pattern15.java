package Patterns;
import java.util.*;
public class Pattern15 {
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
     * pat151
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * 1
     * 2 3 2
     * 3 4 5 4 3
     * 2 3 2
     * 1
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nsp = n / 2, nsn = 1, num = 1;

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= nsp; i++) {
                if (row == 1)
                    continue; // only because test case is wrong 😁
                System.out.print("\t");
            }
            // we can make a new var num that can print at the location nsn
            // we are making temp because we can not modify num
            int temp = num;
            for (int i = 1; i <= nsn; i++) {

                System.out.print(temp + "\t");
                // preparing temp for next place
                // like num 3 then
                // i == 1 and nsn == 5
                // for i = 1 print temp = num = 3 and if block check i <= (5/2) = 2 so temp++
                // (4)
                // for i = 2 print temp = 4; i(2) <= 2; so temp++ (5)
                // for i = 3 print temp = 5; i(3) > 2 so else temp--(4)
                // for i = 4 print temp = 4; i(4) > 2 so else temp--(3)
                // for i = 5 print temp = 5; i(5) > 2 so else temp--(2)
                // and thats why we not use num is decrease num by 1
                if (i <= nsn / 2) {
                    temp++;
                } else {
                    temp--;
                }
            }
            // move to newline
            System.out.println();
            if (row <= n / 2) {
                nsp--;
                nsn += 2;
                num++;
            } else {
                nsp++;
                nsn -= 2;
                num--;
            }
        }

    }
}
