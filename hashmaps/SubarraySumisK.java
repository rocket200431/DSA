package hashmaps;
import java.util.*;
public class SubarraySumisK {
    public static void subArraySumisK(int nums[],int k ){

      HashMap<Integer,Integer>hm=new HashMap<>();
      int sum=0;
      int ans=0;
      hm.put(0,1);
      for(int i=0;i<nums.length;i++){
        sum=nums[i];
        if(hm.containsKey(sum-k)){
            ans+=hm.get(sum-k);
        }
        hm.put(sum,hm.getOrDefault(sum, 0)+1);


    }

    }
   

    public static void main(String[] args) {
        int nums[]={1,2,3};
        subArraySumisK(nums, 3);

    }
}
