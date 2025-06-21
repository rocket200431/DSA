public class kadangas{

    public static  void maxsum(int numbers[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.print("maxsum="+ms);
    }
    
    public static void main( String arg[]){
     
        //numbers[]={1,2,3,4,5}; this is wrong declaration in java
        /*int[] myIntArray = new int[3]; // each element of the array is initialised to 0
int[] myIntArray = {1, 2, 3};
int[] myIntArray = new int[]{1, 2, 3};*/
int numbers[]={1,-2,3,-4,5};

maxsum(numbers);

    }
}