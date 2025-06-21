public class bruteforce{

    public static void maxsumsubarray(int numbers[]){
        int sum1=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            
            int start=i;
            for(int j=i;j<numbers.length;j++){
                
                int sum=0;
                int end=j;
                System.out.print("{");
                for(int k=start;k<=end;k++){
                    System.out.print(" " +numbers[k]);
                    sum=sum+numbers[k];
                    
                }
                if(sum>sum1){
                    sum1=sum;
                }
                System.out.print("}");
             
            }
            System.out.println("");

            
        }
        System.out.print("maxvalue="+ sum1);

    }
    public static void main( String arg[]){
     
        //numbers[]={1,2,3,4,5}; this is wrong declaration in java
        /*int[] myIntArray = new int[3]; // each element of the array is initialised to 0
int[] myIntArray = {1, 2, 3};
int[] myIntArray = new int[]{1, 2, 3};*/
int numbers[]={1,2,3,4,5};

maxsumsubarray(numbers);

    }
}