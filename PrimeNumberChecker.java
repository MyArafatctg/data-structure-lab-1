package com.arafat;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :" );
        int num = scanner.nextInt();
        primeChecker(num);
    }
    public static void primeChecker(int number){
        boolean isPrime = false;
        for (int i = 2; i<= number / 2; i++){
            if (number % i == 0){
                isPrime = true;
                break;
            }
        }
        if (!isPrime){
            System.out.print(number + " is a prime number");
        }else {
            System.out.print(number + " is not a prime number");
        }
    }

}
