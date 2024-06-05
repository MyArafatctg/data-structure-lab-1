package com.arafat;
import java.util.Scanner;
public class PrimeGenerator {
        static void primeGenerator(int n){
            for(int i = 2; i<=n; i++){
                primeCheker(i);
            }
        }
        static void primeCheker(int number){
            boolean flg = false;
            for (int i = 2; i<= number/2; i++){
                if (number % i == 0){
                    flg = true;
                    break;
                }
            }
            if (!flg)
                System.out.print(number + " ");
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of n number : ");
            int n = scanner.nextInt();
            primeGenerator(n);
        }
}

