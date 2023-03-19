package com.mahady;

import java.io.*;

public class ReadFIleWithFileReader {
    /* public static void main(String[] args) {
        File file =new File("D:\\java\\JavaTutorial\\src\\com\\mahady\\text.txt");
        BufferedReader br = null;
        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line;
            // file er pura line porar jonno amra while er modde loop chailace jotokon null pabe na totokon read korte thakbe
            while ((line = br.readLine())!=null)
            {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: "+ file.toString());
        }
        catch (IOException e){
            System.out.println("Unable to read file : "+ file.toString());
        }
        finally {
            try {
                br.close();
            } catch (IOException e){
                System.out.println("Unable to close file: "+ file.toString());
            }catch (NullPointerException ex){
                //FIle was probably never opened
            }


        }



    }*/
    // amra shohozie korte pari jodi amra try resource diye kori eta java 7++ er ekta feature
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(BufferedReader br= new BufferedReader(new FileReader(file))){

            }catch(FileNotFoundException e){
                System.out.println("File cant open: "+ file.toString());
            } catch (IOException e) {
            System.out.println("Unable to read file: "+ file.toString());
        }


    }
    }


