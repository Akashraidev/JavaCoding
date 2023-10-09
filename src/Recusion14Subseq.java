public class Recusion14Subseq {
    public static void Subsequence(String str,int idx, String newString){
        // base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        Subsequence(str,idx+1,newString+currChar);

        // not to be
        Subsequence(str,idx+1,newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        Subsequence(str,0,"");
    }
}
