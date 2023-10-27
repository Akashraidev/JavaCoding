import java.io.*;
import java.util.*;
public class stringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        str = str.trim();
        String[] token = str.split("[^a-zA-Z]+");

        if (token.length == 0) {
            System.out.println("0");
        } else {
            System.out.println(token.length);
        }

        for (String word : token) {
            System.out.println(word);
        }
    }
}

