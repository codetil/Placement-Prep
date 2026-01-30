// Q.1) Write a function named "remove duplicates" that takes an array of integers in random 
// order and eliminates all the duplicate integers in the array.  The function should take two 
// arguments: 
// (1) An array of integers 
// (2) An integer that tells the number of cells An array 
// 'a': The integer array of numbers 
// 'n': The number of integers An the array 
// RETURNS: 
// The function should not return a value, but if any duplicate integers are eliminated, then 
// array is restructured such that the unique value precedes repeated values. 
// EXAMPLE:If input is 
// int a[11]=(58,26,91,26,70,70,91,58,58,58,66) 
// Revised array:  
// A [11] = ( 58  26  91  70  66 70 91 58 58 58 66)

public class Q1 {      

    public static void main(String[] args) {

        int[] arr = new int[] {58, 26, 91, 26, 70, 70, 91, 58, 58, 58, 66};

        int n = arr.length;

        int[] duplicates = new int[n];
        int d = 0;
        int index = 0;

        for(int i = 0; i < n; i++){
            boolean isDuplicate = false;

            for(int j = 0; j < index; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                duplicates[d++] = arr[i];
            } else{
                arr[index++] = arr[i];
            }
        }
        for(int i = 0; i < d; i++){
            arr[index++] = duplicates[i];
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
     }
}