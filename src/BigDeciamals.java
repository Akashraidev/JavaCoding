import java.math.*;
public class BigDeciamals {
    public static void main(String[] args) {
        double num1 = 0.1;
        double num2 = 0.2;
        double sum = num1 + num2;

        System.out.println(sum); // Prints 0.30000000000000004

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bdSum = bd1.add(bd2);

        System.out.println(bdSum); // Prints 0.3

//Addition:
        BigDecimal n1 = new BigDecimal("0.5");
        BigDecimal n2 = new BigDecimal("0.2");

        BigDecimal s = n1.add(n2); // use add method
        System.out.println("Sum: " + s); // Sum: 0.3

//Subtraction:
        BigDecimal a = new BigDecimal("0.7");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal difference = a.subtract(b);
        System.out.println("Difference: " + difference); // Difference: 0.6

        // Square Root:
       


    }
}
