package sorting;



public class Countingsort {
    public static void counting(int arr[]){
     int Largest=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        Largest=Integer.max(Largest, arr[i]);
     }
     int count[]=new int[Largest+1];
     for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
     }
     int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }



    }
    public static void main(String[] args) {
         int arr[]={5,4,2,2,2,1,4,4,3,1};
   
          counting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
