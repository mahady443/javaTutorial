package com.mahady;



public class StringBuildersAndFormating {
    public static void main(String[] args) {
        String info ="";
        info += "my name is mahady";
        info += " ";

        info += "I am a builder";
        System.out.println(info);

        StringBuilder ab = new StringBuilder("");
        ab.append("my namei s Mahady");
        ab.append(" ");
        ab.append("I am a buuilder");
        System.out.println(ab.toString());

        StringBuilder a = new StringBuilder();
        a.append("My naame is Hasan")
        .append(" ")
                .append(" I am a Student");
        System.out.println(a.toString());


        //Formatting
        System.out.print("some text \t tab is work \n new line add" );

        //formatting integer

        for (int i=0;i<5;i++){
            System.out.printf("some code here %2d\n",i);
        }

        // Formatting float

        System.out.printf("Total value %.2f\n",5.6);
        System.out.printf("Total Value %-5.1f",343.2154);



    }
}
