import java.util.Scanner;

public class maxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int max = 0;
        while ( n > 0){
            int rem = n % 10;
            if (rem > max){
                max = rem;
            }
            n = n/ 10;
        }
        System.out.println("max digit - "+ max);
    }
}
