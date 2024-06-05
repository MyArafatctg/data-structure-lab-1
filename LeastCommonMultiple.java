package com.arafat;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 , n2 , gcd = 1;
        System.out.print("Enter First Number : ");
        n1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        n2 = scanner.nextInt();
        for(int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        int lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of " + n1 + " and " + n2 + " is " + lcm);
    }
}
