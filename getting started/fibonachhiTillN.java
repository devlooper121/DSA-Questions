import java.util.*;

public class fibonachhiTillN {
    /*
     * Constraints
     * 1 <= n < 40
     * 
     * Format
     * Input
     * n
     * 
     * Output
     * 0
     * 1
     * 1
     * 2
     * 3
     * 5
     * 8
     * .. first n fibonaccis
     * 
     * Example
     * Sample Input
     * 
     * 10
     * 
     * Sample Output
     * 0
     * 1
     * 1
     * 2
     * 3
     * 5
     * 8
     * 13
     * 21
     * 34
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {

            int temp = first;
            first = second;
            second = temp + second;
            System.out.println(temp);

        }
    }
}

/*

*/