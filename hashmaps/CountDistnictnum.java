package hashmaps;
import java.util.*;
public class CountDistnictnum {
    public static void countdisnum(int  nums[]){
        HashSet<Integer>hms=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hms.add(nums[i]);
            
        }
       System.out.println( hms.size());

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,51,2,3,4};
        countdisnum(nums);
    }
    
}
