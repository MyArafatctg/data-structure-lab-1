package com.arafat;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num , sum = 0;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
