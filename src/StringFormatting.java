public class StringFormatting {
    public static void main(String[] args) {
        String str = "JAVA"; // string length 3(0,1,2,3)
        System.out.printf("%s",str);
        System.out.println(); // for next line
        System.out.printf("%15s",str); // now string length is 15 (right justify)
        System.out.println(); // for next line
        System.out.printf("%-15s",str); // now string length is 15 (left justify)
        System.out.println(); // for next line

        String a = "Hello";
        System.out.printf("%-15s  %-10s",a,str);
        System.out.println(); // for next line
        System.out.printf("%-15s  %-10s %n",a,str); // cursor on blink new line

        System.out.println("************");
        int x = 12;
        System.out.printf("%-14d %n",x);
        System.out.printf("%-15s %-4d %n",str,x);

        int b = 11;
        System.out.printf("%10d %n",b);
        System.out.printf("%015d %n",b);

        System.out.println("************");
        float f = 12.0f;
        System.out.println(f);
        System.out.printf("%f %n",f);
        System.out.printf("% .3f  %n",f);  // %n use for next line

    }
}
