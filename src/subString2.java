import java.io.*;
import java.util.*;
public class subString2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String S = in.next();

        System.out.println("Enter Start(0 < star < end <= S.length()");
        int start = in.nextInt();
        
        System.out.println("Enter End(0 < star < end <= S.length()");
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}
