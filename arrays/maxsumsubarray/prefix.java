public class prefix{
    public static void prefixarray(int numbers[]){
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];

        for(int i=1;i<numbers.length;i++){


            prefix[i]=prefix[i-1]+numbers[i];


          
        }

        int maxvalue=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            int cursum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            if(cursum>maxvalue){
                maxvalue=cursum;
            }

        }

        }
System.out.print("maxsumis"+maxvalue);
        
    }
    public static void main(String arg[]){
        int numbers[]={ 1,2,3,4,5};

        prefixarray(numbers);
    }
}