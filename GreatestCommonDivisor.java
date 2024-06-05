package com.arafat;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        // find GCD between n1 and n2
        int n1 , n2 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        n1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        n2 = scanner.nextInt();
        // initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}
