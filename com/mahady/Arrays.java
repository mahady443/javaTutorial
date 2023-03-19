package com.mahady;

public class Arrays {
    public static void main(String[] args) {
        int [] values;
        values = new int[3];
        System.out.println(values[0]);
        values[0]= 23;
        System.out.println(values[0]);
        int [] number = {5,7,9};

        for(int i =0;i <number.length;i++)
        {
            System.out.println(number[i]);
        }

        //arrays string

        String[] words = new String[3];
        words[0]= "Hello";
        words[1]="to";
        words[2]= "you";
        System.out.println(words[0]);

        String[] fruits = {"banana","mango","apple"};
        for(String fruit:fruits)
        System.out.println(fruit);







    }
}
