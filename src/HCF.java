import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcf = 0, min = 0;
        if (n1< n2){
            min = n1;
        }else {
            min = n2;
        }
        for (int i = 1; i <= min; i++){
            if ((n1 %i ==0)&& (n2 % i ==0)){
                hcf = i;
            }
        }
        System.out.println("HCF "+ hcf);
    }
}
