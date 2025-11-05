package javabootcamp.ArrayProblems;

public class Search_02 {

    public static void main(String[] args) {

        int[][] arr = {
                {12,67,90},
                {55,7,14}
        };

        int target = 7;

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j] == target) {
                    System.out.println("found");
                }
            }
        }

        System.out.println("Not Found");

    }
}
