package com.mahady;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Input");
        int line = input.nextInt();
        System.out.println("Your input: " + line);


    }
}
