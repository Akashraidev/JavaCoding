import java.util.Scanner;
public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int flag = 0;
        for (int i = 1; i < num ; i++){
            if(num == i*i){
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Perfect Square");
        }else {
            System.out.println("Not  a perfect square");
        }
    }
}
