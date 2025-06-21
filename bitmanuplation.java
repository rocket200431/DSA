public class bitmanuplation {

public static void isoddoreven(int a){
    int bitmask=1;
    if((a&bitmask)==1){
        System.out.println("it is an odd");


    }else{
        System.out.println("it is an even ");
    }
}

public static  int getithbit(int n, int i){

    int bitmask=1<<i;
    if((n&bitmask)==0){
        return 0;
    }else{
        return 1;
    }

}
public static int setithbit(int n,int i){
    int bitmask=1<<i;
    return (n|bitmask);
}
public static int clearithbit(int n,int i){
    int bitmask=~(1<<i);
    return (n&bitmask);
}
public static void updateithbit(int n,int i,int newbit){
    // if(newbit==0){
    //     System.out.print(clearithbit(n, i));

    // }else{
    //    System.out.println( setithbit(n, i));

    // }
n =clearithbit(n, i);
int bitmask=newbit<<i;

    System.out.println((n|bitmask));


}
public static int clearlastibits(int n,int i){
    int bitmask=((~0)<<i);
 return n & bitmask;
}
public static int clearrangeofbits(int n,int i,int j){
    int a=((~0)<<(j+1));
    int b=(1<<i)-1;  //(2^2-1=011)and 2^3-1=0111 like that series and 1<<i=2^i
    int bitmask=a|b;
    return n & bitmask;
}
public static void ispowerof2(int n){
    if((n&n-1)==0){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
public static int countsetbits(int n){
    int count=0;
    
    while(n>0){
        if((n&1)!=0){
            count++;
        }
        n=n>>1;
    }
    return count;
}
public static int fastexponentaitaion(int a,int n){
    int ans=1;
    while(n>0){
        if((n&1)!=0){
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;

    }
    return ans;
} //same wise see modular exponentiation 
    public static void main(String[] args) {
        //isoddoreven(3);
        //System.out.println(clearithbit(10, 1));
        //updateithbit(10, 2, 1);
       //System.out.print( clearlastibits(15,2));
       //ispowerof2(16);
       System.out.println(fastexponentaitaion(3, 5));
        
    }





    
}
