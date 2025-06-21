import java.util.Stack;

public class ReverseString {


    public static String reverseStr(String str){
        int idx=0;
        Stack<Character>s=new Stack<>();
        while(idx<str.length()){
           
            s.push( str.charAt(idx));
            idx++;

        }

        StringBuilder result=new StringBuilder();
        while(!s.isEmpty()){
            char top=s.pop();
            result.append(top);

        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str="abc";
        String result= reverseStr(str);
       System.out.print(result);
    }




    
}
