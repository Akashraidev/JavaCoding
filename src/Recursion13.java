public class Recursion13 {

    public static boolean[] map = new boolean[26];

    public static void removeDuplica(String str, int idx, String newString){
        // base case
         if (idx == str.length()){
             System.out.println(newString);
             return;
         }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true){

            removeDuplica(str,idx+1,newString);
        }else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplica(str,idx+1,newString);
        }
    }


    public static void main(String[] args) {
    String str = "abbcdab";
        removeDuplica(str,0,"");
    }
}
