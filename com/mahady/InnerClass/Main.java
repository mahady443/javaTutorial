package com.mahady.InnerClass;

public class Main {
    public static void main(String[] args) {
        Robot robot1= new Robot(7);
        robot1.strat();
        Robot.Charge charge = new Robot.Charge();
        charge.charge();
    }

}
