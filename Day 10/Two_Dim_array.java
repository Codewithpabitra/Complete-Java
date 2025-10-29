package javabootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class DimArray {

    public static void main(String[] args) {

//        {
//            {12,34,55},
//            {34,99},
//            {12,0,78,34}
//        }

        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5]; // 1D array
        int[][] arr = new int[3][2]; // row number mandatory [row][col]

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
