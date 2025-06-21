package DividenConcqer;

public class PraticeSheetq1 {

    public static String[] mergesort(String str[],int lo,int hi){

        if(lo==hi){
            String [] A={str[lo]};
            return A;
        }

        int mid=lo+(hi-lo)/2;
        String [] arr1=mergesort(str, lo, mid);
        String [] arr2=mergesort(str, mid+1, hi);

        String [] arr3=merge(arr1,arr2);
        return arr3;



     }

     public static String[] merge(String[] arr1,String [] arr2){
        int m=arr1.length;
        int n=arr2.length;

        String arr3[]=new String[m+n];

        int idx=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[idx]=arr1[i];
                i++;

            }else{
                arr3[idx]=arr2[j];
                j++;
            }
            idx++;
        }

            while(i<m){
                arr3[idx++]=arr1[i++];
            }
          while(j<n){

            arr3[idx++]=arr2[j++];
          }

          return arr3;


     }


     public static boolean isAlphabeticallySmaller(String str1,String str2){
     if(str1.compareTo(str2)<0){
        return true;
     }
     return false;
}

public static void main(String[] args) {
    String str[]={"earth","mars","venus","neptune"};
    String arr[]=mergesort(str, 0, str.length-1);
    for(int i=0;i<str.length;i++){
        System.out.println(arr[i]);
    }
}
    
    
}



