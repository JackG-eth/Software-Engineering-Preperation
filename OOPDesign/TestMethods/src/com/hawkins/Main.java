package com.hawkins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//    private static boolean compressRow(int[] row){
//        boolean shifted = false;
//        int cLI = Integer.MAX_VALUE;
//        for (int i = 0; i < 4 - 1; i++) {
//            if (row[i] == 0) {
//                for (int j = i + 1; j < 4; j++) {
//                    if (row[j] != 0) {
//                        shifted = true;
//                        row[i] = row[j];
//                        row[j] = 0;
//                        break;
//                    }
//                }
//            }
//
//        }
//        for(int i = 0; i < row.length; i++){
//            System.out.println(row[i] + " : ");
//        }
//        return shifted;
//
//    }

    private static final int SIDE = 4;

    private static void rotateClockwise(int[][] passedArray){
        int[][] ret = new int[SIDE][SIDE];
        for(int i = 0; i < SIDE; i++){
            for(int j = 0; j < SIDE; j++){
                    ret[i][j] = passedArray[SIDE-j-1][i];
                System.out.println( ret[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        int[][] rotate = {
                {2,2,2,2},
                {4, 4, 4, 4},
                {8, 8, 8, 8},
                {0, 0, 0, 0}
        };

        rotateClockwise(rotate);
    }
}
