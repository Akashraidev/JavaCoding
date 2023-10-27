import java.io.*;
import java.util.*;
public class stringReverse2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        // without using inbuild method
        String A = sc.nextLine();
        String B = "";

        for (int i = A.length()-1; i>= 0; i--){
            B += A.charAt(i);
        }

        if (A.equals(B)){
            System.out.println("Entered word is a palindrome word");
        }else{
            System.out.println("'Not' a palindrome  word");
       }
    }
}