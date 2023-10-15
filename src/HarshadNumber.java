import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (num > 0){
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        if (temp % sum == 0){
            System.out.println("Harshad Number");
        }else {
            System.out.println(" Not Harshad Number");
        }
    }
}
