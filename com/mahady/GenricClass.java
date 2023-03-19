package com.mahady;

import java.util.ArrayList;
import java.util.HashMap;

public class GenricClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Mango");
        list.add ("Orange ");

        String fruit = (String) list.get(2);
        System.out.println(fruit);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("bird");

        String animal = strings.get(1);
        System.out.println(animal);
        //multivalue
       // HashMap

    }
}
