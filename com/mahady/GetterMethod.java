package com.mahady;

class Person1{
    String name;
    int age;
    void speak(){
        System.out.println("My name is : " + name);
    }

    int calculateYearsToGetJob() {
        int yearsleft= 65-age;
        System.out.println(yearsleft);
        return yearsleft;


    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }


}


public class GetterMethod {
    public static void main(String[] args) {

        Person1 person=new Person1();
        person.name = "Mahady Hasan";
        person.age = 20;
        person.speak();
        int years = person.calculateYearsToGetJob();

        int age = person.getAge();
        String name = person.getName();
        System.out.println( " Name is : " +name);
        System.out.println("Age is "+ age);

    }
}
