public class Fibonacci {

    public static void main(String[] args) {
        int n = 6;
        int a = 1; int b = 2; 
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            if(i == 1 || i == 3){
                System.out.println();
            }
        }
    }
}