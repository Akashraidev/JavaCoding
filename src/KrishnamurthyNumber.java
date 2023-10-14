import  java.util.Scanner;
public interface KrishnamurthyNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int copy = n;
        int sum = 0;

        while (n > 0){
            int r = n % 10;
            int f = 1;
            for (int i = 1; i <= r; i++ ){
                f = f * i;
            }
            sum = sum + f;
            n = n / 10;
        }
        if (sum == copy){
            System.out.println("Krishnamurthy Number");
        }else {
            System.out.println(" not a Krishnamurthy Number");
        }
    }
}
