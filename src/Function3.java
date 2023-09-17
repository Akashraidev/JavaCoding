import java.util.*;
public class Function3 {
    public static int calculateProduct(int x, int y)
    {
        return x * y;

        // mul = x*y;
        //return  mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two Number");
        a = sc.nextInt();
        b = sc.nextInt();

        int Multiply = calculateProduct(a,b);
//        System.out.println("Product of two number is ="+Multiply);

        System.out.println("Product of two number is ="+calculateProduct(a,b));
    }
}
