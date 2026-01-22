import java.util.Scanner;

// Q.2) Accept 5 number in an array, accept a number from user and check if given number is there in an array or not 
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter a number to check: ");
        int numberToCheck = sc.nextInt();

        boolean found = false;
        for (int num : numbers) {
            if (num == numberToCheck) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(numberToCheck + " is in the array.");
        } else {
            System.out.println(numberToCheck + " is not in the array.");
        }

        sc.close();
    }
} 