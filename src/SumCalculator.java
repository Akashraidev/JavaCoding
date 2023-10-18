import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("This program calculates the sum of numbers entered by the user until the user enters 0.");
        System.out.println("Enter numbers (0 to quit):");
        int num;
        while ((num = sc.nextInt()) != 0) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
