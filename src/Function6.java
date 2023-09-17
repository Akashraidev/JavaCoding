import java.util.*;
public class Function6 {

    public static void sumOddNum(int n)
    {
        int sum = 0;
       for (int i=1; i<=n; i++)
       {
           if ((i%2)!=0)
           {
               sum = sum + i;
           }
       }
        System.out.println("sum of all odd numbers from 1 to n  is = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n for the sum of all odd numbers from 1 to n ");
        int n = sc.nextInt();

        sumOddNum(n);
    }
}
