// Q.2)  Given 2 sorted arrays of integers, print common elements between 2 arrays in single loop.  
// Method Signature void printCommon(int[] arr1, int [] arr2, int arr1_len, int arr2_len) { } 
 
// Example 1  
// Input- 
// arr1[] = {1, 3, 4, 5, 7}  
// arr2[] = {2,3,5, 6} 
// Output : 3,5  
 
// Example 2  
// Input - 
// arr1[] = {2,5, 6}  
// arr2[] = {4, 6, 8, 10}  
// Output : 6 

public class Q2 {
    
    void printCommon(int[] arr1, int[] arr2, int arr1_len, int arr2_len) {
        int i = 0, j = 0;

        while (i < arr1_len && j < arr2_len) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        Q2 ce = new Q2();
        ce.printCommon(arr1, arr2, arr1.length, arr2.length);
    }
}
