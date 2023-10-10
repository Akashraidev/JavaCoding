import java.util.HashSet;
public class Recursion15 {
    public static void Subsequence(String str,int idx, String newString,HashSet<String> set){
        // base case
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        // to be
        Subsequence(str,idx+1,newString+currChar,set);

        // not to be
        Subsequence(str,idx+1,newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        Subsequence(str,0,"",set);
    }
}

