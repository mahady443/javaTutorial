package com.mahady;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("ENter a Command");
        String text = input.nextLine();

        switch (text){
            case "start":
                System.out.println("Machine Start");
                break;

            case "stop":
                System.out.println("Machine Stoped");
            default:
                System.out.println("Command not recognize");

        }


    }
}
