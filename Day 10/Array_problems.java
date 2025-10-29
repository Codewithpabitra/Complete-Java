package javabootcamp;

import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {
        // indx1, indx2

//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;

//        int[] arr = {12,34,67,89,100};

        // max element of the array
//        int max = arr[0];
//
//        for(int num : arr) { // for each loop
//            if(num > max) {
//                max = num;
//            }
//        }

//        System.out.println(max);


        // reverse the array
        int[] arr = {12,34,67,89,100};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    // homework - reverse the array without two pointer approach
}
