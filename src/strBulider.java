import java.util.*;
public class strBulider {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0,'R');
        System.out.println(sb);

        // inset at index
        sb.insert(0,'S');
        System.out.println(sb);

        // delete at index
        sb.delete(0,1);
        System.out.println(sb);

        // append

        sb.append("Stark");
        System.out.println(sb);

        // lenght of stringBuilder

        System.out.println(sb.length());
    }
}
