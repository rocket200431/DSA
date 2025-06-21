package DividenConcqer;
public class theory {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
        }
        
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;

            }
            k++;
        }
        while(i<=mid){
        temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
for(k=0,i=si;k<temp.length;k++,i++){
    arr[i]=temp[k];
}

    }

    // time complexity of merge sort is o(nlogn) and space complexity is o(n)


    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+((ei-si)/2);
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

// qucik sort



public static void quicksort( int arr[],int si,int ei){

    if(si>=ei){
        return;
    }
    int pindx=partiotion(arr,si,ei);
    quicksort(arr,si,pindx-1);
    quicksort(arr,pindx+1,ei);   

}
// here pivot elemt is last elemt 
public static int partiotion(int arr[],int si,int ei){
    int pivot=arr[ei];
    int i=si-1;
 int temp;
    for(int j=si;j<=ei;j++){

        if(arr[j]<pivot){
            i++;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           
        }

    }

    i++;
    temp=arr[i];
    arr[i]=pivot;
     arr[ei]=temp;
     return i;
}

public static int  searchrotatedarray(int arr[],int tar,int si,int ei){
if(si>ei){
    return -1;
}
int mid=si+(ei-si)/2;



// case found
if(arr[mid]==tar){
    return mid;
}
// on  mid is line 1
if(arr[si]<=arr[mid]){
if(arr[si]<=tar&&tar<=arr[mid]){
    return searchrotatedarray(arr, tar, si, mid-1);
}else{
    // on right part
    return searchrotatedarray(arr, tar, mid+1, ei);
}
}else{
    if(arr[mid]<=tar&&tar<=arr[ei]){
        return searchrotatedarray(arr, tar, mid+1, ei);
    }else{
        return searchrotatedarray(arr, tar, si, mid-1);
    }
}
}
public static int binarysearch(int arr[],int tar){
    int si=0,ei=arr.length-1;
while(si<=ei){
    int mid=si+(ei-si)/2;
    if(arr[mid]==tar){
        return mid;
    }else if(tar<arr[mid]){
        ei=mid-1;
    }else{
        si=mid+1;
    }




}
  return -1;
}

//pratice ques

// my mehtod but it leads to wrong sol
// public static void ques1(String str[]){
//     int arr[]=new int[str.length];
//     for(int i=0;i<str.length;i++){
//         arr[i]=((int)str[i].charAt(0)+(int)str[i].charAt(1)+(int)str[i].charAt(2));

//     }
//     String strtem[]=new String[str.length];
//     mergesort(arr, 0, arr.length-1);
//     for(int i=0;i<arr.length;i++){
//         int tar=((int)str[i].charAt(0)+(int)str[i].charAt(1)+(int)str[i].charAt(2));
       
//        strtem[binarysearch(arr, tar)]=str[i];
       
//     }
// System.out.println("the string after sorted is");
//     for(int i=0;i<strtem.length;i++){
// System.out.println(strtem[i]);
//     }

// }




    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
       // mergesort(arr, 0, arr.length-1);
       
        // quicksort(arr, 0, arr.length-1);
        //  printarr(arr);
        System.out.println(searchrotatedarray(arr, 0, 0, arr.length));

    String str[]={"sun","earth","mars","mercury"};
   // ques1(str);


         
        
    }
}