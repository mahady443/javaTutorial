package com.mahady.com.mahady.Interface;

public class Person implements Info {
    private String name;
    public Person(String name){
        this.name = name;
    }


    public void greet()
    {
        System.out.println("Hello there");
    }

    @Override
    public void showinfo(){
        System.out.println("Person name "+name);
    }

}
