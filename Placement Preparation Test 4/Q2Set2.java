// Q.2) Given a 1-based indexing array arr[] of non-negative integers and an integer sum. You 
// mainly need to return the left and right indexes(1-based indexing) of that subarray. In 
// case of multiple subarrays, return the subarray indexes which come first on moving from 
// left to right. If no such subarray exists return an array consisting of element -1. 
// Examples:  
// Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], target = 23 
// Output: [2, 5] 
// Explanation: Sum of subarray arr[2…5] is 2 + 4 + 8 + 9 = 23. 
// Input: arr[] = [1, 10, 4, 0, 3, 5], target = 7 
// Output: [3, 5] 
// Explanation: Sum of subarray arr[3…5] is 4 + 0 + 3 = 7. 
// Input: arr[] = [1, 4], target = 0 
// Output: [-1] 
// Explanation: There is no subarray with 0 sum.

public class Q2Set2 {
    
    public static int[] subarray(int arr[], int target){
        int n = arr.length;
        int right = 0;
        int left = 0;
        int curr_sum = 0;
        while(right < n){
            curr_sum += arr[right];


                            
            while (curr_sum > target && left <= right) {
                curr_sum -= arr[left];
                left ++;
            }
            if(curr_sum == target){
                return new int[] {left+1, right+1};
            }
            right++;
        }
        return new int[] {-1};
    }
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        int[] res = subarray(arr, target);
        System.out.println(res);
    }
}
