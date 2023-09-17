import java.util.*;
public class subStrings {
    public static void main(String[] args) {

        String sentance = "my name is Tony";
        String sentance2 = "TonyStark";
//        substring(beg index, end index)
        String name = sentance.substring(11,sentance.length());

        String name2 = sentance2.substring(0,3);
        System.out.println(name);
        System.out.println(name2);
    }
}
