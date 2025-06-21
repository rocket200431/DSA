package dp;

public class fibonachi {


    public static int  findFibonachi(int n,int f[]){
        if(n==0||n==1){
            return  n;
        }
        if(f[n]!=0){
            return f[n];
        }

        f[n]=findFibonachi(n-1, f)+findFibonachi(n-2, f);
        return f[n];

    }


public static int fibTabular(int n){
    int f[]=new int[n+1];
    f[0]=0;f[1]=1;
    for(int i=2;i<=n;i++){
f[i]=f[i-1]+f[i-2];

    }

    return f[n];
}


 

public static void main(String[] args) {
        int n=4;
        int f[]=new int[n+1];
       int fib= findFibonachi(n, f);
       System.out.println(fib);

    }
}
