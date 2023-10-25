import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string (A): ");
        String A = sc.nextLine();
        System.out.print("Enter the second string (B): ");
        String B = sc.nextLine();

        // Calculate and print the sum of the lengths of A and B
        int sumOfLengths = A.length() + B.length();
        System.out.println("Sum of the lengths of A and B: " + sumOfLengths);

        // Compare strings A and B and print "Yes" if A is lexicographically greater
        // "No" otherwise
        int comparisonResult = A.compareTo(B);
        if (comparisonResult > 0) {
            System.out.println("A is lexicographically greater than B: Yes");
        } else {
            System.out.println("A is lexicographically greater than B: No");
        }

        // Capitalize the first letter of each string and print them with a space
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println("Capitalized A and B with a space: " + capitalizedA + " " + capitalizedB);
    }
}
