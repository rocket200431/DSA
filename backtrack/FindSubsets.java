package backtrack;
public class FindSubsets {
    public static void printSubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
               

            }else{
                System.out.println(ans);
                
            }
            return;
        }
     printSubsets(str, ans+str.charAt(i), i+1);
     printSubsets(str, ans, i+1);

    }



    public static void main(String[] args) {
        printSubsets("abc", "", 0);
    }

    
}