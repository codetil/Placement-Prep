// Q.1) Print 2nd largest and 2nd smallest elements from a given integer array 'arr' of size arr_len in a single loop.  

// Method Signature 
// void print2nd(int arr[], int arr_len) {  
//             //Your code here  
// } 
 
 
// Example 1  
// Input:  
// arr[]: 5, 10, 0, 2, 3, 4  
// arr_size = 6  
 
// Output: 2, 5  

public class Q1 {
    
    public static void findSecondMinMax(int[] arr) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x < firstMin) {
                secondMin = firstMin;
                firstMin = x;
            } else if (x < secondMin && x != firstMin) {
                secondMin = x;
            }

            if (x > firstMax) {
                secondMax = firstMax;
                firstMax = x;
            } else if (x > secondMax && x != firstMax) {
                secondMax = x;
            }
        }

        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Largest  = " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 0, 2, 3, 4};
        findSecondMinMax(arr);
    }
}
