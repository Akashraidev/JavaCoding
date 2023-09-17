import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String firstname  = "Tony";
        String lastname  = "stark";

        // concatination
        String fullname  =  firstname +" " + lastname;

        System.out.println(fullname);

        // lenght
        System.out.println(fullname.length());


        // charAt()
        for (int i = 0; i < fullname.length(); i++)
        {
            System.out.println(fullname.charAt(i));
        }

        // compare

        if (firstname.compareTo(lastname)==0)
        {
            System.out.println("String is equal");
        }else {
            System.out.println("String is not equal");

        }
    }
}
