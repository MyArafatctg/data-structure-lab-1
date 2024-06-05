package com.arafat;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Term of Fibonacci Series :" );
        int numberOfTerm = scanner.nextInt();
        calculateFibonacci(numberOfTerm);
    }
    static void calculateFibonacci(int numberOfTerm){
        int firstNumber = 0;
        int secondNumber = 1;
        int n = numberOfTerm;
        int nextTerm = firstNumber + secondNumber;
        System.out.print("Fibonacci Series is " + firstNumber + "," + secondNumber);
        for (int i = 3; i<= n; i++){
            System.out.print("," + nextTerm);
            firstNumber = secondNumber;
            secondNumber = nextTerm;
            nextTerm = firstNumber + secondNumber;
        }
    }
}
