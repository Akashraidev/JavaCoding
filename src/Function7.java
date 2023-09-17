import  java.util.*;
public class Function7 {

    public static int checkGreaterNum(int a, int b) {
         if(a>b) {
             return a;
         }else {
             return b;
         }
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number 'a' and 'b' ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(checkGreaterNum(a,b));
    }
}
