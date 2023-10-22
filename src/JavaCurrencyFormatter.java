import java.util.*;
import java.text.*;
    public class JavaCurrencyFormatter {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter num");
            double payment = scanner.nextDouble();

            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = new DecimalFormat("###,###.00");
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println("US: " + us.format(payment));
            System.out.println("India: Rs." + india.format(payment));
            System.out.println("China: " + china.format(payment));
            System.out.println("France: " + china.format(payment));
        }
    }
