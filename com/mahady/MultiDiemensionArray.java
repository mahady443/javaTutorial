package com.mahady;

public class MultiDiemensionArray {
    public static void main(String[] args) {
        //single diemension
        int [] values ={5,2,25};
        System.out.println(values[1]);
        //2 dimension

        int [][] grid={
                {5,2},
                {21,5,6},
                {12,44,2,5}
        };
        System.out.println(grid[1][1]);
        System.out.println(grid[2][0]);

        String[][] texts =new String[2][3];

        texts [0][1]= "hello there";
        texts[0][2]="this world is too good :)";

        System.out.println(texts[0][2]);

        for (int row=0; row<grid.length;row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();

        }
    }
}
