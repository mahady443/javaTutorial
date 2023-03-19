package com.mahady;

class Frog{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;

    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }
}



public class SetterAndThisMethod {

    public static void main(String[] args) {

        Frog frog1 = new Frog();

        /*
        private modifier k access korar jonno setter method use kora hoi
        frog1.name ="Mahady Hasan"
        frog1.age = 20;


         */
        frog1.setName("Mahady Hasan");
        frog1.setAge(10);
        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());


    }
}
