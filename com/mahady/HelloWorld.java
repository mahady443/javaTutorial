package com.mahady;


    public class HelloWorld {
        final Integer instanceVariable =10;//final mean intialized value and thats it final and never change in code
      void NonStaticTest(){

            System.out.println("NoN STatic Method,.");
        }

        public static void StaticTest(){
        System.out.println(" Static Metod");
        }



        public static void main(String[] args) {
            System.out.println("Hello world!");

            HelloWorld ob1= new HelloWorld();
            ob1.NonStaticTest();
            StaticTest();
            int x=10;
            System.out.println(x++);
        }
    }

