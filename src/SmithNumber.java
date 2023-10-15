import java.util.Scanner;

public class SmithNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       int copy = n;
        int sum = 0, sumfact = 0;

        // sum of digits
        while (n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        // sum of prime factor
        for (int i = 2; i < copy; i++){

            if (copy % i == 0){

                if (i > 9){
                    int num = i;
                    while (num > 0){
                        int rem = n % 10;
                        sumfact = sumfact + rem;
                        num = num / 10;
                    }
                }else {
                    sumfact += i;
                    copy = copy / i;
                }
            }else {
                i++;
            }
        }
        if(sumfact == sum){
            System.out.println("Smith number");
        }else {
            System.out.println("Not Smith Number");
        }
    }
}
