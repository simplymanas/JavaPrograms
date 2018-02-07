//You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
//
//        Example
//
//        For
//
//        a =
//        [[1, 2, 3],
//         [4, 5, 6],
//         [7, 8, 9]]
//        the output should be
//
//        rotateImage(a) =
//        [[7, 4, 1],
//         [8, 5, 2],
//         [9, 6, 3]]

package com.simplymanas.learning;

import java.util.Arrays;

public class Rotate2DMatrix {

    public static int[][]  RotateMatrix(int[][] input) {

       int[][] output = new int[input.length][input.length];
       int col= input.length-1;
        for (int[] rows: input){
            int row=0;
            for(int i1:rows ){
                output[row][col]=i1;
                row++;
            }
            col--;
        }
        return output;
    }
    public static void main(String[] args) {
        int[][] input = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] output = RotateMatrix(input);
        System.out.println(Arrays.deepToString(output));
    }
}
