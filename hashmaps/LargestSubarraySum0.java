package hashmaps;
import java.util.*;
public class LargestSubarraySum0 {
    public static int returnLargestSubArrayofSum0(int nums[]){
        HashMap<Integer,Integer>hm= new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(!hm.containsKey(sum)){
            hm.put(sum,i);
        }else{
                length=Math.max(i-hm.get(sum), length);
            }

        }

        return length;


    }

    public static void main(String[] args) {
     int nums[]={15,-2,2,-8,1,7,10,23};
       System.out.println( returnLargestSubArrayofSum0(nums));
    }
    
}
