package javabootcamp.ArrayProblems;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {12, 34, 67,89,90};
        int target  = 67;
        int range1 = 2;
        int range2 = 4;
        boolean val = Search(arr,target,range1,range2);
        System.out.println(val);

    } // arr.length

    static boolean Search(int[] arr, int target,int r1, int r2) {
        for(int i=r1;i<=r2;i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
