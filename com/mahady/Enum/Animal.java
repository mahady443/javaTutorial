package com.mahady.Enum;

public enum Animal {
    // here Cat is not string type this are special object enum er moode thake enum costant name
    CAT("JHON"),DOG("HERIE"),MOUSE("JERRY");
    private String name;
    Animal(String name) {
        this.name= name;
    }

    public String getname() {
        return name;
    }
    public String toString(){
        return "This is animal called "+ name;
    }
}
