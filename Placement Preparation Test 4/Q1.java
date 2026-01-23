// Q.1) Print unique sorted array, Accept data in sorted order having duplicate value. You need 
// to print unique array using single loop . 
// Unique sorted array using 1 loop 
// Input:- 1  1  2  2  2 5    output:-1 2 5
public class Q1 {

    public static void printUnique(int arr[]){
        
        int n = arr.length;

        System.out.print(arr[0]);

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 5};
        printUnique(arr);
    }
}