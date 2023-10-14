import java.util.Scanner;
public class DisariumNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();

        int copy1 = num, copy2 = num;

        int count = 0, s = 0;

        while (num > 0){
            count++;
            num = num/10;
        }

        while (copy1 > 0){
            int rem = copy1 % 10;
            s = s + (int)Math.pow(rem,count--);
            copy1 = copy1 / 10;
        }
        if ( s == copy2){
            System.out.println("Disarium number");
        } else {
            System.out.println("Not a Disarium number");
        }
    }
}
