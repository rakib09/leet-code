package com.extremecoder.data_structure;

import java.util.Arrays;

public class ReshapetheMatrix_566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int total = mat[0].length*mat.length;
        if(total != (r*c)) return mat;
        int[][] result = new int[r][c];
        int it = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                result[it/c][it%c] = mat[i][j];
                it++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] ints = matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        for (int[] x : ints)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
