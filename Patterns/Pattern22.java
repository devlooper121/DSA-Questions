package Patterns;

import java.util.*;

public class Pattern22 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int nst = n, nsp = 0;

        for (int row = 1; row <= n; row++) {
            // print space
            for (int i = 1; i <= nsp; i++) {
                System.out.print("\t");
            }
            // printing str
            for (int i = 1; i <= nst; i++) {
                if (row > n / 2 && row != n) {
                    if (i > 1 && i < nst) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                } else {
                    System.out.print("*\t");

                }
            }
            // move to newline
            System.out.println();
            if (row <= n / 2) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nst += 2;
            }
        }

    }
}