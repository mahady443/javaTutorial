package com.mahady.MultiException;

import java.io.IOException;
import java.text.ParseException;
// Multi exception er somoy amra just oi sob exception dhorai dibo jmano first line e
// or amra try catch er maddome korte pari jieta ekta ekta kore handle korbe
// or amra ekta kaj korte pari exception class korle er under e joto subexception class ace sob call hoi jar jonno amader alada
// alada call kora lagbe na
// amra multi handle er maddome o korte pari
public class App {
    public static void main(String[] args) {//throws IOException, ParseException {
        Test test= new Test();
        // single- try
        /*try {
            test.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/

        // catch by exception class
        /* try {
            test.run();
        } catch (Exception e) {
            System.out.println(" file not found");
        }*/
        // Multi- catch
        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }*/
    }
}
