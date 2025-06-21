package dp;

public class climbingStairs {

    public static int recurisveclimbing(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        return recurisveclimbing( n-1)+recurisveclimbing(n-2);

    }

    public static int  memorizationclimbing(int n,int mc[]){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }

        if(mc[n]!=0){
            return mc[n];
        }

        mc[n]=memorizationclimbing(n-1, mc)+memorizationclimbing(n-2, mc);
        return mc[n];

    }
    

    public static int tabularClimbing(int n){
        int tc[]=new int[n+1];
        tc[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                tc[i]=tc[i-1]+0; 
        }
            tc[i]=tc[i-1]+tc[i-2];
        }

        return tc[n];
    }




}


