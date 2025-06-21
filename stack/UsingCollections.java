
import java.util.*;
public class UsingCollections {
    
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();
        s.push(6);
        s.push(5);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
        System.out.println(s.pop());}
       
        
    }
}
