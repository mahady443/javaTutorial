package com.mahady;

import java.util.Objects;

class Man{
    private int id;
    private String name;
    public  Man(int id , String name){
        this.id = id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return id == man.id && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString(){
        return "Man[id = "+ id +",name="+name +"]";

    }
}

public class TheEqualMethods {
    public static void main(String[] args) {
        Man man1 = new Man(1,"Mahady");
        Man man2 =new Man(2,"Hasan");
        System.out.println(man1==man2);
    }


}
