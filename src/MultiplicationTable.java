import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for which you want to print the multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Input the range (how many multiples to print)
        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
