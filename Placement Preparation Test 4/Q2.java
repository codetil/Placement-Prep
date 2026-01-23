// Q.2) To find the maximum sum of all subarrays of size K: 
// Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ 
// consecutive elements in the array. 
// Input  : arr[] = {100, 200, 300, 400}, k = 2 
// Output : 700

public class Q2 {

    public static int sum_of_all_subarray(int arr[], int k){

        int n = arr.length;
        int max_sum = 0;
        for(int i = 0; i < k; i++){
            max_sum += arr[i];
        }
        int window_sum = max_sum;
        for(int i = k; i < n; i++){
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;

    }
    public static void main(String[] args) {
        
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        int res = sum_of_all_subarray(arr, k);
        System.out.println(res);
    }
}
