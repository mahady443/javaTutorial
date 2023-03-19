package com.mahady.Enum;



public class My {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        switch(animal) {
            case CAT -> {
                System.out.println("Cat");
                break;
            }
            case DOG -> {
                System.out.println("Dog");
                break;
            }
            case MOUSE -> {
                System.out.println("Mouse");
                break;
            }
            default -> {
                break;
            }
        }
        System.out.println(Animal.DOG);
        System.out.println("Enum name as a String"+Animal.CAT.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.MOUSE.getname());

        Animal animal1=Animal.valueOf("DOG");
        System.out.println(animal1);

    }
}
