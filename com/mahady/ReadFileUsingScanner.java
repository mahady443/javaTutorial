package com.mahady;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        String filename= "C:/Users/mahad/OneDrive/Desktop/Example.txt"; // coding e front slash kaj kore so thats why backslash diye always path lekte hoi

        File textfile =new File(filename);
        Scanner file = new Scanner(textfile);
        int value = file.nextInt();
        System.out.println("The Value is "+ value);
        file.nextLine();
        int count=2;
        while (file.hasNextLine()){
            String line = file.nextLine();
            System.out.println(count+":"+line); // bujte hobe valo kore ro
            count++;
        }
        file.close();

        }

    }
