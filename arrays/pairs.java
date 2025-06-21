
public class pairs{
    public static void pair(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");

            }
            System.out.println("");

        }
    }
    public static void main(String arg[]){
       
        int numbers[]={2,4,5,9,12};
        pair(numbers);

    }
}