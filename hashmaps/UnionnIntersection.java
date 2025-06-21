package hashmaps;
import java.util.*;

public class UnionnIntersection {
   public static void printNoOfUnionnIntersection(int arr1[],int arr2[]){
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0,j=0;i<arr1.length||j<arr2.length;i++,j++){
       if(i<arr1.length){
        hs.add(arr1[i]);}
        if(j<arr2.length){
        hs.add(arr2[j]);}
    }

    System.out.println("no of union elements are "+hs.size()+"and  union elements are "+hs);
    hs.clear();
     for(int i=0;i<arr1.length;i++){
        hs.add(arr1[i]);
        
    }
    int count=0;
    System.out.println("intersection set are");
    for(int i=0;i<arr2.length;i++){
        if((hs.contains(arr2[i]))){
             System.out.print(arr2[i]+" ");
             count++;
        }

    }
    System.out.println();
    System.out.println("total no of intersection are "+count);



   }

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5,6,7,8};
        printNoOfUnionnIntersection(arr1, arr2);

        
    }
    
}
