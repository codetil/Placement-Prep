// Q.1) Segregate positive and negative integers in linear time.
// Given an array of positive and negative integers, 
// The output should print all negative numbers, followed by all positive numbers. 
// For example, 
// Input: [19, -13, 15, -12, -18, -16, 1, 3] 
// Output: [-13, -12, -18, -16, 15, 19, 1, 3 
// After showing above output copy this data into another array and sort it.
public class Q1{

    public static int[] Segregate(int[] arr){
        int n = arr.length;
        int [] result = new int[n];
        int left = 0, right = n - 1;
        for(int num : arr){
            if(num<0){
                result[left++] = num;
            } else{
                result[right--] = num;
            }
        }
        return result;
    }
    
    public static void main(String args[]){

        int[] arr = {19, -13, 15, -12, -18, -16, 1, 3};
        int[] segregated = Segregate(arr);
        for(int num : segregated){
            System.out.println(num + " ");
        }
    }
}