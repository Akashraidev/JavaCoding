import java.util.*;
public class isStringPalindrome {

 static boolean ispalindrome(String word){

     int forwordIdx =0, backwordIdx = word.length() -1;
     while (forwordIdx != backwordIdx){
         char startChar = word.charAt(forwordIdx);
         char endChar = word.charAt(backwordIdx);
         if (startChar != endChar){
             return false;
         }
         forwordIdx++;
         backwordIdx--;
     }
     return true;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.nextLine();

        if (ispalindrome(word)){
            System.out.println("palindrome");
        }else {
            System.out.println("is not palindrome");
        }
    }
}
