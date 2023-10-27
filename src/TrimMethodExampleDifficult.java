import java.util.Scanner;

public class TrimMethodExampleDifficult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Trim and count words
        input = input.trim();
        String[] words = input.split("\\s+");

        System.out.println("Original Input: \"" + input + "\"");

        System.out.println("Number of words: " + words.length);
        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}

