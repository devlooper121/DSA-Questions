import java.util.*;

public class rotateANum {
    /*
     * 1. You are given two numbers n and k. You are required to rotate n, k times
     * to the right. If k is positive, rotate to the right i.e. remove rightmost
     * digit and make it leftmost. Do the reverse for negative value of k. Also k
     * can have an absolute value larger than number of digits in n.
     * 2. Take as input n and k.
     * 3. Print the rotated number.
     * 4. Note - Assume that the number of rotations will not cause leading 0's in
     * the result. e.g. such an input will not be given
     * n = 12340056
     * k = 3
     * r = 05612340
     * 
     * Constraints
     * 1 <= n < 10^9
     * -10^9 < k < 10^9
     * 
     * Format
     * Input
     * "n" where n is any integer.
     * "K" where k is any integer.
     * 
     * Output
     * "r", the rotated number
     * 
     * Example
     * Sample Input
     * 
     * 562984
     * 2
     * 
     * Sample Output
     * 845629
     */
    public static void main(String[] args) {
        // write your code here Scanner
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        int tempN = n;
        int len = 0;
        while (tempN > 0) {
            tempN = tempN / 10;
            len++;
        }

        if (k < 0) {
            k = -k;
            k = len - k % len;
        } else {
            k = k % len;
        }
        int dL = (int) Math.pow(10, k);
        int last = n % dL;

        n = n / dL;
        int dS = (int) Math.pow(10, len - k);
        int ans = last * dS + n;
        System.out.println(ans);
    }
}