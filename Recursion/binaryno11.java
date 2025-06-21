package Recursion;
import java.util.*;

public class binaryno11 {

    public static void nocons11(int n,String str){

       
        if(n==1){
            str.charAt(n)='1';
        }
        System.out.println(str);
        nocons11(n-1,str);
        
        



    }
    
}
