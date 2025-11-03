// 1. 
```java 
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n]; // O(2N)   

        for(int i=0;i<n;i++) {
            arr[i] = nums[i];
            arr[i+n] = nums[i];
            
        } // TC - O(n) 

        

        return arr;

    } 
}
```

// 2. 
```java
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++) {
            ans[i] = nums[nums[i]]; 
        } // 1 to n 

        return ans;
    }
}
```
// 3. All you know 
```java
public int f(int[] arr) {
    int max = arr[0];

    for(int i =0;i<n;i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }

    return max;
}
// find the min similarly 
```


// 4. 
```java
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int slargest = -1;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
        
        
    }
    
    
}
```


// 5. Find the smallest and second smallest elements in a given array - make your solution optimized. 
```java
```




