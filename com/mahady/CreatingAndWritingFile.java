package com.mahady;

import java.io.*;

public class CreatingAndWritingFile {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
        br.write("First line");
        br.newLine();
        br.write("Second Line ");
        br.newLine();
        br.write("Last Line");
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
