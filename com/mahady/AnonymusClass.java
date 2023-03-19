package com.mahady;
class Machine{
    void start(){
        System.out.println("Machine is Started");
    }
}
interface Plant{
    void grow();
}

public class AnonymusClass {
    public static void main(String[] args) {
        Machine machine1= new Machine(){
            @Override
            void start() {
                System.out.println("Camera is Snap"); // eikane kono class nai method er jonno tai eita anonymous class  ei class er object ektai hoi
            }
        };
        machine1.start();
        Plant plant=new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant is grow");
            }
        };
        plant.grow();

    }
}
