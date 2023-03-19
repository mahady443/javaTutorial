package com.mahady;
class Machin1{
    public void start(){
        System.out.println("MAchine start");
    }
}

class Camera extends Machin1{
    public void start (){
        System.out.println("Camera is Strated");
    }

    public void snap(){
        System.out.println("Photo TAKEN");
    }
}








public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        Machin1 mahcine = new Machin1();
        Camera camera = new Camera();
        mahcine.start();
        camera.start();
        camera.snap();

        //upcasting
           Machin1 machine2=camera;
           machine2.start();
           //error machine2.snap() because amra eikhane object e call korci method k na
        //down casting
            Machin1 machine3= new Camera();
            Camera camera2 =(Camera)machine3;
            camera2.start();
            camera2.snap();
            
    }

}
