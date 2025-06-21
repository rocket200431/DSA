package backtrack;

public class FindPermutations {
// tc is o(n*n!) for every string to print takes n levels for n! strings total n*n!
    public static void printPermuatations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String NewStr=str.substring(0, i)+str.substring(i+1);
            printPermuatations(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        printPermuatations("abc", "");
    }
}
