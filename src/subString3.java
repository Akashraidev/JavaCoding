public class subString3 {

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        // Example 1: Extract a substring from the beginning of the string
        String substring1 = originalString.substring(0, 5); // "Hello"
        System.out.println("Example 1: " + substring1);

        // Example 2: Extract a substring starting from the 7th character
        String substring2 = originalString.substring(7); // "World!"
        System.out.println("Example 2: " + substring2);

        // Example 3: Extract a substring using both start and end indices
        String substring3 = originalString.substring(7, 12); // "World"
        System.out.println("Example 3: " + substring3);

        // Example 4: Extract a substring from the 2nd character to the 6th character
        String substring4 = originalString.substring(1, 6); // "ello,"
        System.out.println("Example 4: " + substring4);

        // Example 5: Extract the last 5 characters from the string
        String substring5 = originalString.substring(originalString.length() - 5); // "World!"
        System.out.println("Example 5: " + substring5);
    }
}
