import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= num;i++){

            if (num % i ==0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Entered number "+ num+ " is a prime number");
        }else {
            System.out.println("Entered number " + num + " is not a prime number");
        }
    }
}
