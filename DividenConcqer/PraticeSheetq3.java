package DividenConcqer;

public class PraticeSheetq3 {


    public static int mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return 0;

        }
  int mid=si+(ei-si)/2;
     int left=mergesort(arr, si, mid);
     int right=mergesort(arr, mid+1, ei);
     return left+right+countInversions(arr, si, mid,ei);


    }

    public static int countInversions(int arr[],int si,int mid,int ei){
       int count=0;
        int k=0;
        int i=si;
        int j=mid+1;
        int temp[]=new int[ei-si+1];
        while(i<=mid&&j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;

            }else{
                count+=(mid-i+1);
                temp[k]=arr[j];
                j++;
                k++;

            }

        }

        while(i<=mid){
           temp[k++]= arr[i++]; 
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return count;



    }

    public static void main(String[] args) {
        int arr[]={4,5,6,2,3,1,0};
        System.out.println(mergesort(arr, 0, arr.length-1));
        
    }
    
}
