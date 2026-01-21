public class Reverse_Binary {

    public static void main(String[] args) {

        int n = 13;
        System.out.print("Reverse Binary: ");
        while(n > 0){
            System.out.print(n % 2);
            n = n / 2;
        }
    }
}