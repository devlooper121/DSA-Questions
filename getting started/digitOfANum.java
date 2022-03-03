import java.util.*;

public class digitOfANum {

    public static void main(String[] args) {
        // write your code here
        /*
         * 1. You've to display the digits of a number.
         * 2. Take as input "n", the number for which digits have to be displayed.
         * 3. Print the digits of the number line-wise.
         * 
         * Constraints
         * 1 <= n < 10^9
         * 
         * Format
         * Input
         * "n" where n is any integer.
         * 
         * Output
         * d1
         * d2
         * d3
         * ... digits of the number
         * 
         * Example
         * Sample Input
         * 
         * 65784383
         * 
         * Sample Output
         * 6
         * 5
         * 7
         * 8
         * 4
         * 3
         * 8
         * 3
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int l = 0, temp = n;

        while (temp > 0) {
            temp = temp / 10;
            l++;
        }

        int d = (int) Math.pow(10, l - 1);

        while (d > 0) {
            System.out.println(n / d);
            n = n % d;
            d = d / 10;
        }
    }
}