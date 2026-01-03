package javabootcamp.Refreshments;

import java.util.Scanner;

public class RefreshMents {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 12;
//        Scanner in = new Scanner(System.in);
//
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println("What to find > ");
//        int x = in.nextInt();

//        for(int i=0;i<arr.length;i++) {
//            if(arr[i] == x) {
//                System.out.println("found at index : " + i);
//            }
//        }

        // 2D array
        int[][] twoDArray = new int[3][2];
        Scanner in = new Scanner(System.in);

        for(int i = 0;i<twoDArray.length;i++) {
            for(int j=0;j<twoDArray[i].length;j++) {
                twoDArray[i][j] = in.nextInt();
            }
        }

        for(int i = 0;i<twoDArray.length;i++) {
            for(int j=0;j<twoDArray[i].length;j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        in.close();

    }
}
