public class Recursion6 {
    public static void towerOfHanoi(int n, String scr, String helper, String dest){
        if (n==1){
            System.out.println("transfer disk"+ n + "from"+ scr + "to"+ dest);
            return;
        }
       // transfer top n-1 from src to helper using dest as 'helper'

        towerOfHanoi(n-1, scr, dest, helper);

        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from" + scr + " to" + dest);

        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1,helper,scr,dest);
    }
    public static void main(String[] args) {
        int n = 1;
        towerOfHanoi(n,"S","H","D");
    }
}
