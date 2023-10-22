import java.util.*;
import java.text.*;

    public class JavaCurrencyFormatter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter num");
            double payment = scanner.nextDouble();
            scanner.close();

            Locale usLocale = new Locale("en", "US");
            Locale indiaLocale = new Locale("en", "IN");
            Locale chinaLocale = Locale.CHINA;
            Locale franceLocale = Locale.FRANCE;

            NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
            NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
            NumberFormat china = NumberFormat.getCurrencyInstance(chinaLocale);
            NumberFormat france = NumberFormat.getCurrencyInstance(franceLocale);

            String usFormatted = us.format(payment);
            String indiaFormatted = india.format(payment);
            String chinaFormatted = china.format(payment);
            String franceFormatted = france.format(payment);

            System.out.println("US: " + usFormatted);
            System.out.println("India: " + indiaFormatted);
            System.out.println("China: " + chinaFormatted);
            System.out.println("France: " + franceFormatted);
        }
    }
