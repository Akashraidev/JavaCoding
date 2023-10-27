public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello, ");

        // Appending text to the StringBuilder
        sb.append("world!");
//        System.out.println(sb);    // "Hello, world!".


        // Inserting text at a specific position
        sb.insert(7, "beautiful ");
//       System.out.println(sb);          //Hello, beautiful world!



        // Deleting characters from the StringBuilder
        sb.delete(0, 7);
//        System.out.println(sb); // Hello


        // Replacing a substring
        sb.replace(0, 5, "Hi");
//        System.out.println(sb);   //Hi, beautiful world


        // Converting StringBuilder to a String
        String result = sb.toString();
        System.out.println(result);
    }
}
