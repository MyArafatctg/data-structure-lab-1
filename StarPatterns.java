package com.arafat;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args){
        int noOfStar, rowCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Star : ");
        noOfStar = scanner.nextInt();
        for (int i = noOfStar; i>0; i--){
            for (int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= rowCount; j++){
                System.out.print("* ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
