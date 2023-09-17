import java.util.*;
public class Function4 {
    public static void findFactorial(int x)
    {
        if (x<0)
        {
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;
        for (int i = x; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Entered Number Factorial " +factorial);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for factorial = ");
      int n = sc.nextInt();
      findFactorial(n);
    }
}
