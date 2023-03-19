package com.mahady;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /*
        System.out.println("Enter ur number : ");

        int value = scanner.nextInt();
        while(value !=5){

            System.out.println("Enter Ur Number");
            value= scanner.nextInt();

        }

        */
        int value = 0;
        do {
            System.out.println("Enter ur number : ");

            value = scanner.nextInt();
        }
        while (value !=5);

        System.out.println("got 5 !");





    }
}
