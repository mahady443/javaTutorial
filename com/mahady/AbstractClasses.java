package com.mahady;

abstract class Bird{
    void sound(){
        System.out.println("Bird can make sounds");
    }
    void fly(){
        System.out.println("Bird can fly :)");
    }
}
class Parrot extends Bird{


}
// we cant make abstract class object remember that
public class AbstractClasses {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.sound();


    }
}
