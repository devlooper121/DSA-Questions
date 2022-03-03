import java.util.*;

public class pythagorianTriplet {
    /*
     * 1. You are required to check if a given set of numbers is a valid pythagorean
     * triplet.
     * 2. Take as input three numbers a, b and c.
     * 3. Print true if they can form a pythagorean triplet and false otherwise.
     * 
     * Constraints
     * 1 <= a <= 10^9
     * 1 <= b <= 10^9
     * 1 <= c <= 10^9
     * 
     * Format
     * Input
     * a, an integer
     * b, an integer
     * c, an integer
     * 
     * Output
     * true if the numbers form a pythagorean triplet and false otherwise
     * 
     * Example
     * Sample Input
     * 
     * 5 3 4
     * 
     * Sample Output
     * true
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();
        int max;
        int small1, small2;
        if (a > b && a > c) {
            max = a;
            small1 = b;
            small2 = c;
        } else if (b > c) {
            max = b;
            small1 = a;
            small2 = c;
        } else {
            max = c;
            small2 = a;
            small1 = b;
        }

        if ((small2 * small2 + small1 * small1 == max * max)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}