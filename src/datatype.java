import java.util.*;

public class datatype {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            try{
                long l = sc.nextLong();
                System.out.println(l+" can be fitted in:");

                if(l >= -127 && l <= 128){
                    System.out.println("* byte");
                }
                if(l >= -32768 && l <= 32767){
                    System.out.println("* short");
                }
                if(l >= -2147483648 && l <= 2147483647){
                    System.out.println("* int");
                }
                if(l >= -9223372036854775808L && l <= 9223372036854775807L){
                    System.out.println("* long");
                }
            } catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}