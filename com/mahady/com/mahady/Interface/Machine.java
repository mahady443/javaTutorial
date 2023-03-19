package com.mahady.com.mahady.Interface;

public class Machine implements Info {
    private int id = 7;
    public void Strat (){
        System.out.println("Machine is Start");
    }

    @Override
    public void showinfo() {
        System.out.println("MAchine id"+id);
    }
}
