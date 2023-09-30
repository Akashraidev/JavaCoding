import java.util.Scanner;

public class AlphabetCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize an array to store the count of each alphabet (both uppercase and lowercase)
        int[] alphabetCount = new int[26 * 2]; // 26 for lowercase, 26 for uppercase

        // Convert the input string to lowercase for case-insensitive counting
        input = input.toLowerCase();

        // Loop through the input string to count the alphabets
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Increment the count for the lowercase alphabet
                alphabetCount[ch - 'a']++;
            }
        }

        // Display the counts
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ": " + alphabetCount[ch - 'a']);
        }

        scanner.close();
    }
}
