package com.arafat;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of " + num + " = " + factorial);
    }
}
