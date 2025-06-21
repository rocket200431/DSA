package Recursion;
import java.util.*;
public class tiling {
   

// work here is making choices between horizontal and vertical way to fill the tiles if vertical so n-1 space will be reamined and horizontal so n-2 space will be remained 

public  static int tiling1(int n){
    if(n==0||n==1){
        return 1; // when n=0 there is no way to fill the tiles hence no way is also a one of the way to fill
    }
    int fn1=tiling1(n-1);
    int fn2=tiling1(n-2);
    return fn1+fn2;
}


    public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.err.println(tiling1(n));
        
    }
    
}




