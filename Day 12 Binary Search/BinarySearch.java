class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
//            int mid = (start + end)/2; // it may exceed the int max size , INTEGER.max_value 
            int mid = start + (end - start)/2;
         
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target) {
                    start = mid + 1;
            }else {
                    end = mid - 1;
            }

        }

        return -1; // ele not found
    }
}

// leetcode - https://leetcode.com/problems/binary-search/