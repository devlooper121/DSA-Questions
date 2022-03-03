import java.util.*;

public class gcdLcm {
    /*
     * 1. You are required to print the Greatest Common Divisor (GCD) of two
     * numbers. 2. You are also required to print the Lowest Common Multiple (LCM)
     * of the same numbers. 3. Take input "num1" and "num2" as the two numbers. 4.
     * Print their GCD and LCM.
     * 
     * 
     * Constraints
     * 2 <= n <= 10^9
     * 
     * Format
     * Input
     * num1
     * num2
     * .. the numbers whose GCD and LCM we have to find.
     * 
     * Output
     * a
     * b
     * .. where 'a' and 'b' are the GCD and LCM respectively.
     * 
     * Example
     * Sample Input
     * 
     * 36
     * 24
     * 
     * Sample Output
     * 12
     * 72
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int gcd, lcm, mul = n1 * n2;
        // Equlidian formulae
        // Date 28/02/2022 FJP-6 Class Mohit bhel
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        gcd = n2;
        lcm = mul / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}