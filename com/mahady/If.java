package com.mahady;

public class If {
    public static void main(String[] args) {

        int myint = 20;
        int loop=0;

        while (loop <5){
            System.out.println("looping" +loop);
            loop++;

            if(loop ==5){
                break;
            }
            loop ++;

            System.out.println("Running");

        }


        if (myint < 10){
            System.out.println("Thats is true");

        }
        else if (myint >10){
            System.out.println("No its not ");
        }
        else {

            System.out.println("none avobe is true");
        }

    }
}
