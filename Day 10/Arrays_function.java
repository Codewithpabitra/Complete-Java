package javabootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Array_function {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArray(int[] copy) {
        copy[0] = 99;
    }
}
