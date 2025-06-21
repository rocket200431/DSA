package sorting;
import java.util.Arrays;

public class Selectionsrot {
    public static void selection(int arr[]){
for(int i=0;i<arr.length;i++){
    int minPos=i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[minPos]){
            minPos=j;
        }

    }
    int temp=arr[minPos];
    arr[minPos]=arr[i];
    arr[i]=temp;
}

    }
    public static void main(String[] args) {
        int arr[]={5,4,2,3,1};
        //selection(arr);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
