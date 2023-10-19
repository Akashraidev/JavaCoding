import java.io.*;
import java.util.*;

public class Int_to_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a to convert them String");
        System.out.println("if number convert into String then print Good job ");
        int n = sc.nextInt();
        String str = Integer.toString(n);

        if( (n>= -100 && n<= 100)  && n == Integer.parseInt(str) ){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
    }
}
