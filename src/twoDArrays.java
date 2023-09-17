import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] num = new int[row][col];

        // input
        // rows
        for (int i = 0; i < row; i++)
        {
            // column
            for (int j = 0; j < col; j++)
            {
                 num[i][j] = sc.nextInt();
            }
        }

        // o/p
        for (int i = 0; i < row; i++)
        {
            // column
            for (int j = 0; j < col; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
