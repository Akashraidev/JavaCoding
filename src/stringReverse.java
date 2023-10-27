import java.io.*;
import java.util.*;

public class stringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String A = sc.nextLine();
        String B = new StringBuilder(A).reverse().toString();
        if(A.equals(B)){
            System.out.println("Entered word is a palindrome word");
        }else{
            System.out.println("'Not' a palindrome  word");
        }
    }
}