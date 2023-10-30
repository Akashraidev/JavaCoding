import java.util.Scanner;

public class stringWordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Count the words in the text
        int wordCount = countWords(text);

        System.out.println("Word count: " + wordCount);
    }

    public static int countWords(String text) {
        // Split the text into words using whitespace as a delimiter
        String[] words = text.split("\\s+");

        // Return the count of words
        return words.length;
    }
}
