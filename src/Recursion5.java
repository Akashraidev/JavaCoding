public class Recursion5 {
    public static int calcPower(int x,int n){
   if (n==0){
       return 1;
   }
   if (x==0){
       return 0;
   }
        int xPownm1 = calcPower(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x=3,n=5;
        int ans  = calcPower(x,n);
        System.out.println("x to the power n= "+ans);
    }
}
