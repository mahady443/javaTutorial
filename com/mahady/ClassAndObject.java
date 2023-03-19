package com.mahady;
class Person{
    //class contain data,method,
    //instance variable (data or state)

    String name;
    int age;
     void speak() {
         for (int i = 0; i < 3; i++) {
             System.out.println("My name is " + name + "My age is " + age + "years  old");

             System.out.println("Hello");
         }
     }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.name ="mahady hasan";
        person1.age = 20;


        Person person2 =new Person();
        person2.age=15;
        person2.name= "dont know";

        System.out.println(person1.name +"\n"+ person1.age);
        person1.speak();

    }
}
