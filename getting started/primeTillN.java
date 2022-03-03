
// package getting.started;
import java.util.Scanner;

public class primeTillN {
    /*
     * 1. You've to print all prime numbers between a range.
     * 2. Take as input "low", the lower limit of range.
     * 3. Take as input "high", the higher limit of range.
     * 4. For the range print all the primes numbers between low and high (both
     * included).
     * 
     * Constraints
     * 2 <= low < high < 10 ^ 6
     * 
     * Format
     * Input
     * low
     * high
     * 
     * Output
     * n1
     * n2
     * .. all primes between low and high (both included)
     * 
     * Example
     * Sample Input
     * 
     * 6
     * 24
     * 
     * Sample Output
     * 7
     * 11
     * 13
     * 17
     * 19
     * 23
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h = scn.nextInt();
        scn.close();
        for(int i = l ; i <= h ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<1) return false;
        if(n % 2 == 0 && n > 2) return false;
        for(int i = 2 ; i*i <= n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
