import java.util.*;

public class sumFirstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        sum(num);
    }
   public static void sum(int n) {
        int  sum = (n * (n + 1)) / 2;
        System.out.println("sum of First n Natural number  is :- " + sum);
    }
}

