public class Recursion16 {

    public static String[] keypad = {"0","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombo(String str, int idx, String Combination){
    // Base Case
        if (idx == str.length()){
            System.out.println(Combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for (int i = 0; i< mapping.length(); i++){
            printCombo(str,idx+1,Combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "32";
        printCombo(str,0,"");
    }
}
