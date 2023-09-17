import java.util.*;
 public class TrueFalse {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number");
         int num = sc.nextInt();
         checkNum(num);
     }

     private static void checkNum(int x) {
         if (x%2==0)
         {
             System.out.println("True");
         }else
         {
             System.out.println("False");
         }
     }
 }
