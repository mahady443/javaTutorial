package com.mahady;
class Joke implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing....");
        throw new Exception("Oh No");
    }
}
// try er modde exception  diya dile hoi
public class TryResorce {
    public static void main(String[] args) {
        try (Joke joke = new Joke()){

        } catch (Exception e){
            e.printStackTrace();
        }

    }

// read file with reader e vlo example ace

}

