import java.util.*;
public class Function2 {
    public static int calculateSum(int x, int y)
    {
        int sum = x + y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print ("Enter two Number");
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("Sum of two number is ="+sum);
    }
}
