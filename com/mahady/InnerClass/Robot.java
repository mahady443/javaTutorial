package com.mahady.InnerClass;

public class Robot {
    private int id; // instance variable

    private class Brain {
        public void thinking(){
            System.out.println("Robot"+ id + " thinking .....");
        }
    }
    static  class Charge{
        public void charge(){
            System.out.println("Battery is Charging "/* +id*/ ); // eikhane id call kora jabe na static class e static variable  call hoi  instance na
        }
    }
    public Robot(int id){
        this.id=id;
    }

    public void strat(){
        System.out.println("Staring Robot . . . .  " + id);
        Brain brain = new Brain();
        brain.thinking();
        String name = "jacob";
        class Temp{
            public void doSomething(){
                System.out.println("Id is :"+ id);
                System.out.println("My name is "+ name); // method er modde kono inner class variable nile oita k final kore dite hobe
            }


        }
        Temp temp = new Temp();
        temp.doSomething();
    }
}
