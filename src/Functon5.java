import java.util.*;
public class Functon5 {
          public static void avgOfThreeNum(float a, float b, float c)
          {
              float avg = (a+b+c)/3;
              System.out.println("Avg of three number is "+avg);
              return;
          }
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              float x,y,z;
              System.out.println("Enter any three number for calculate their Avg ");
              x = sc.nextFloat();
              y = sc.nextFloat();
              z = sc.nextFloat();

              avgOfThreeNum(x,y,z);

    }
}
