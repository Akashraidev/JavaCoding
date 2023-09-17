public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
        { // 1st part
            for (int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }

            // spaces
            int space = 2*(n-i);
            for (int k = 1; k <= space; k++)
            {
                System.out.print(" ");
            }
            // 2nd part
            for (int x= 1; x <= i;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i <= 1; i++)
        {
            for (int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }

            int space = 2*(n-i);
            for (int k = 1; k <= space; k++)
            {
                System.out.print(" ");
            }

            for (int x= 1; x <= i;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
