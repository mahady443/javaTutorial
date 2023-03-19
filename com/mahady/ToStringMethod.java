package com.mahady;

class Frogs {
    private int id;
    private String name;

    public Frogs(int id, String name) {
        this.id = id;
        this.name=name;


    }




    public String toString() {
        return String.format("%d : %s",id, name);


        /*StringBuilder ab = new StringBuilder();
        ab.append(id).append(" : ").append(name);
        return ab.toString();
         */
    }
    }



public class ToStringMethod {
    public static void main(String[] args) {
        Frogs obj = new Frogs(7 ,"Mahady");

        Frogs obj1 = new Frogs(76,"Hasan");
        System.out.println(obj);
        System.out.println(obj1);

    }
}
