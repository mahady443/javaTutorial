package com.mahady.com.mahady.Interface;

public class Main {
    public static void main(String[] args) {

        Machine ob = new Machine();
        Person ob1 = new Person("Mahady");
        ob.Strat();
        ob1.greet();

        Info info1= new Machine();
        info1.showinfo();
        Info info2 = ob1;
        info2.showinfo();
    }
}
