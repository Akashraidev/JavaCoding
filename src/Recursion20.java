public class Recursion20 {
    public static int callGuest(int n){
// Base case
        if (n<=1){
            return 1;
        }
        int ways1 = callGuest(n-1);
        int ways2 = (n-1) * callGuest(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
    int n =2;
        System.out.println("no of ways "+callGuest(n));
    }
}
